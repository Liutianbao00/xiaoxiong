package 二叉树;

public class BinaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void frontShow() {
        root.frontShow();
    }

    public void zhongxu() {
        root.zhongxu();
    }
}
