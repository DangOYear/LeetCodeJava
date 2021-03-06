package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * 145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [3,2,1]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LeetCode0145 {
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
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            Deque<TreeNode> deque = new LinkedList<>();
            TreeNode pre = null;
            while (root != null || !deque.isEmpty()) {
                while (root != null) {
                    deque.push(root);
                    root = root.left;
                }
                root = deque.pop();
                if (root.right == null || root.right == pre) {
                    res.add(root.val);
                    pre = root;
                    root = null;
                } else {
                    deque.push(root);
                    root = root.right;
                }
            }
            return res;
        }
    }
}
