package com.felit.tree.trie;

import java.util.HashSet;

/**
 * Trie树
 */
public class TrieNode {
    public TrieNode[] childNodes;
    //    记录该节点的字符
    public char nodeChar;
    //词频统计
    public int freq;
    public HashSet<Integer> hashSet = new HashSet<Integer>();

    public TrieNode() {
        childNodes = new TrieNode[26];
        freq = 0;
    }

    public void AddTrieNode(TrieNode root, String word, int id) {

    }

    public void DeleteTrieNode(TrieNode root, String word, int id) {

    }

    /**
     * 查找
     * @param root
     * @param word
     * @return
     */
    public String[] getPrefix(TrieNode root, String word) {
        return null;
    }
}
