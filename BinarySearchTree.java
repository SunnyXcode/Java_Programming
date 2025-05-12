package Tree;
public class BinarySearchTree {

    static TreeNode root;
    

    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        

        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
    }

    public void insert(int data){
        root=insert(root,data);
    }

    public TreeNode insert(TreeNode root,int data){

        if(root==null){
            root=new TreeNode(data);
            return root;
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }

    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
        public static void main(String[] args) {
            BinarySearchTree tree=new BinarySearchTree();

            tree.insert( 5);
            tree.insert(3);
            tree.insert( 7);
            tree.insert(1);

            tree.inOrder(root);
        }
    

    
}
