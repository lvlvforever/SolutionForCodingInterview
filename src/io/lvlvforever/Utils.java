package io.lvlvforever;

public class Utils {
    //前序遍历二叉树
    public static void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        System.err.println(node.val);
        traverse(node.left);
        traverse(node.right);
    }
}
