/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structures;

/**
 *
 * @author Chan
 */
class BinarySearchTree {
    private TreeNode root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) return new TreeNode(value);
        if (value < node.value) node.left = insertRecursive(node.left, value);
        else if (value > node.value) node.right = insertRecursive(node.right, value);
        return node;
    }

    public String inorder() {
        StringBuilder sb = new StringBuilder();
        inorderRecursive(root, sb);
        return sb.toString();
    }

    private void inorderRecursive(TreeNode node, StringBuilder sb) {
        if (node != null) {
            inorderRecursive(node.left, sb);
            sb.append(node.value).append(" ");
            inorderRecursive(node.right, sb);
        }
    }

    public String preorder() {
        StringBuilder sb = new StringBuilder();
        preorderRecursive(root, sb);
        return sb.toString();
    }

    private void preorderRecursive(TreeNode node, StringBuilder sb) {
        if (node != null) {
            sb.append(node.value).append(" ");
            preorderRecursive(node.left, sb);
            preorderRecursive(node.right, sb);
        }
    }

    public String postorder() {
        StringBuilder sb = new StringBuilder();
        postorderRecursive(root, sb);
        return sb.toString();
    }

    private void postorderRecursive(TreeNode node, StringBuilder sb) {
        if (node != null) {
            postorderRecursive(node.left, sb);
            postorderRecursive(node.right, sb);
            sb.append(node.value).append(" ");
        }
    }
}

