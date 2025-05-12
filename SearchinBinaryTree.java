package Tree;

public class SearchinBinaryTree {
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

    public TreeNode search(TreeNode root,int key){
        if(root==null || key==root.data){
            return root;
        }
        if(key<root.data){
            return search(root.left,key);
        }else{
            return search(root.left,key);
        }

    }

    public static void main(String[] args) {
        SearchinBinaryTree tree =new SearchinBinaryTree();

        tree.insert(6);
        tree.insert(4);
        tree.insert(2);
        tree.insert(7);
        


        TreeNode result=tree.search(root,10);

        if(result==null){
            System.out.println("Key is not present");
        }
        else{
            System.out.println("Key is present");
        }
    }
    
}
