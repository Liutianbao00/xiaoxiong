package 二叉树;

public class TreeNode {
    //定义一个树的权
    int value;
    //定义左节点
    TreeNode leftNode;
    //定义右节点
    TreeNode rightNode;
    public TreeNode(int value){
        this.value = value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    //111
    public TreeNode getRightNode() {
        return rightNode;
    }

    public void frontShow() {
        System.out.println(value);
        if (leftNode != null){
            leftNode.frontShow();
        }
        if (rightNode != null){
            rightNode.frontShow();
        }
    }

    public void zhongxu() {
        if(leftNode != null){
            zhongxu();
        }
    }
}
