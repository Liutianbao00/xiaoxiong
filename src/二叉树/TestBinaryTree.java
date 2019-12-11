package 二叉树;

public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root1 = new TreeNode(1);
        //把根节点赋值给树
        binaryTree.setRoot(root1);
        //创建两个节点
        TreeNode root2= new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        //把两个节点与左儿子右儿子一一对应
        root1.setLeftNode(root2);
        root1.setRightNode(root3);
        //创建左儿子的左右儿子
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        //分别将两个儿子添加进左节点
        root2.setLeftNode(root4);
        root2.setRightNode(root5);
        //创建右儿子的两个儿子
        TreeNode root6 = new TreeNode(6);
        TreeNode root7 = new TreeNode(7);
        //分别将左节点的两个儿子添加到右节点
        root3.setLeftNode(root6);
        root3.setRightNode(root7);
        System.out.println("前序遍历");
        binaryTree.frontShow();
        System.out.println("中序遍历");
        binaryTree.zhongxu();

    }
}
