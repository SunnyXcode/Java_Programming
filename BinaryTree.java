package Tree;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {

    static TreeNode root;

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void createBinarytree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderStack(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }

        }

    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void inOrderStack(TreeNode root) {

        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }

    // Lever Order Traversal Using Queue Data Structure
    public void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            System.out.print(temp.data+" ");

            if(temp.left!=null){
                q.offer(temp.left);

            }
            if(temp.right!=null){
                q.offer(temp.right);

            }

        }
    }

    public void max(TreeNode root){
        if(root==null){
            return ;
        }
        int max=Integer.MIN_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
          if(temp.data>max){
            max=temp.data;
          }

            if(temp.left!=null){
                q.offer(temp.left);

            }
            if(temp.right!=null){
                q.offer(temp.right);

            }
        }
           System.out.println(max);;
    }

    public int maxRecursion(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=maxRecursion(root.left);
        int right=maxRecursion(root.right);

        if(left>result){
            result=left;
        }
        if(right>result){
            result=right;
        }
        return result;

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.createBinarytree();
        System.out.println("Preorder traversal:");
        tree.preOrder(root);
        System.out.println();

        System.out.println("Preorder traversal using Stack:");
        tree.preOrderStack(root);
        System.out.println();

        System.out.println("Inorder traversal:");
        tree.inOrder(root);
        System.out.println();

        System.out.println("Inorder traversal using Stack:");
        tree.inOrder(root);
        System.out.println();

        System.out.println("Level Order traversal using Queue:");
        tree.levelOrder(root);
        System.out.println();

        System.out.println("Maximum number in Binary Tree:");
        tree.max(root);

        System.out.println("Maximum using Recursion:");
        int result=tree.maxRecursion(root);
        System.out.println(result);


    }
}
