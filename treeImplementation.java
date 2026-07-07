import java.util.*;
public class treeImplementation {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val =val;
        }
    }
    public static void display (Node root,int level) {
    if (root == null){
        return;
    }
        System.out.println("    " + root.val);
        System.out.println("   / \\");
        System.out.println("  " + root.left.val + "   " + root.right.val);
        System.out.println(" / \\ / \\");
        System.out.println(
                root.left.left.val + "  " +
                        root.left.right.val + " " +
                        root.right.left.val + " " +
                        root.right.right.val);

    }
    public static void main(String[] args) {

        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(7);
        Node f = new Node(6);

        root.left =a;
        a.left =c;
        a.right =d;
        root.right =b;
        b.right =e;
        b.left =f;

        display(root,0);
        System.out.println();


    }
}
