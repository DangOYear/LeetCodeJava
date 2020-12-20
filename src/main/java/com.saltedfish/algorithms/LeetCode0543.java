package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode0543 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        int res;
        public int diameterOfBinaryTree(TreeNode root) {
            res = 0;
            depth(root);
            return res - 1;
        }

        public int depth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int L = depth(node.left);
            int R = depth(node.right);
            res = Math.max(res, L + R + 1);
            return Math.max(L, R) + 1;
        }
    }
}
