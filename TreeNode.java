public class TreeNode {

    public static class node {
        int val;
        node right;
        node left;

        public node (int val){
            this.val = val;
        }
    }
    public static void preOrder (node root){
        if (root ==null){
            return ;
        }
        System.out.print(root.val+ " ");
        preOrder(root.left);
        preOrder(root.right);
     }
    public static void postOrder (node root,int level){
        if (root ==null){
            return ;
        }
        postOrder(root.left,level+1);
        postOrder(root.right,level+1);
        System.out.println(root.val+" "+level);
    }
    public static void inOrder ( node root,int level){
        if (root == null){
            return ;
        }
        inOrder(root.left,level+1);
        System.out.println(root.val+" "+level);
        inOrder(root.right,level+1);
    }



    public static void main(String[] args) {

        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(70);
        node n4 = new node(40);
        node n5 = new node(60);
        node n6 = new node(50);

        n1.left =n2;
        n2.left =n4;
        n2.right = n5;
        n1.right = n3;
        n3.right = n6;

        System.out.println("Answer for the preorder : ");
         preOrder(n1);
        System.out.println();
        System.out.println("Answer for the postorder : ");
        postOrder(n1,0);
        System.out.println();
        System.out.println("Answer for Inorder : ");
        inOrder(n1,0);

    }
}
