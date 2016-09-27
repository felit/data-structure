package com.felit.tree.trie;

import java.util.HashSet;

/**
 * Trie树 字典树，前缀树
 * 使用菃围:
 * 第一：词频统计
 * 第二: 前缀匹配
 */
public class TrieNode {
    public TrieNode[] childNodes;
    // 记录该节点的字符
    public char nodeChar;

    // 词频统计
    public int freq;

    // 插入记录时的编码ID
    public HashSet<Integer> hashSet = new HashSet<Integer>();

    public TrieNode() {
        childNodes = new TrieNode[26];
        freq = 0;
    }

    public void addTrieNode(TrieNode root, String word, int id) {
        if (word.length() == 0) {
            return;
        }
        int k = word.charAt(0) - 'a';
        if (root.childNodes[k] == null) {
            root.childNodes[k] = new TrieNode();
            root.childNodes[k].nodeChar = word.charAt(0);
        }
        root.childNodes[k].hashSet.add(id);
        String nextWord = word.substring(1);
        if (nextWord.length() == 0) {
            root.childNodes[k].freq++;
        }
        addTrieNode(root.childNodes[k], nextWord, id);
    }

    public void deleteTrieNode(TrieNode root, String word, int id) {
        if (word.length() == 0) {
            return;
        }
        int k = word.charAt(0) - 'a';
        if (root.childNodes[k] == null) {
            return;
        }

        String nextWord = word.substring(1);

        if (word.length() == 0 && root.childNodes[k].freq > 0) {
            root.childNodes[k].freq--;
        }
        root.childNodes[k].hashSet.remove(id);
        deleteTrieNode(root, nextWord, id);
    }

    @Override
    public String toString() {
        return "TrieNode{" +
                "nodeChar=" + nodeChar +
                ", freq=" + freq +
                ", hashSet=" + hashSet +
                '}';
    }

    /**
     * 查找
     *
     * @return
     */
    public HashSet<Integer> search() {
        return null;
    }

    public int wordCount() {
        return 0;
    }

    public void update() {

    }

    public static void main(String args[]) {
        TrieNode root = new TrieNode();
        root.addTrieNode(root, "hello", 109);
        System.out.println(root.childNodes[7]);
    }
}
