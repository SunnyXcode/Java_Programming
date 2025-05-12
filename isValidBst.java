package Tree;

public class isValidBst {
    static TreeNode root;

    class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data){
            this.data=data;
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

    public boolean isValid(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        boolean left=isValid(root.left,min,root.data);
        if(left){
            boolean right=isValid(root.right,root.data,max);
            return right;
        }
        return false;
    }

    public void createBST(TreeNode root){
        TreeNode first=new TreeNode(6);
        TreeNode second=new TreeNode(7);
        TreeNode third=new TreeNode(2);
        TreeNode fourth=new TreeNode(1000);

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
    }


    public static void main(String[] args) {
        isValidBst tree =new isValidBst();

       tree.createBST(root);
        
        boolean result=tree.isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);

        if(result){
            System.out.println("BST is valid");
        }
        else{
            System.out.println("BST is not valid");
        }


    }
}