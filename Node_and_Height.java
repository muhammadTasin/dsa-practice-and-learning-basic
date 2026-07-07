import java.util.*;
public class Node_and_Height {

    public static class node {
        int value;
        node left;
        node right;

        public node (int value){
            this.value =value;
        }
    }

    public static int nodeCount (node root){
        if (root ==null){
            return 0;
        }

        return 1+nodeCount(root.left)+nodeCount(root.right);
    }
    public static int heightOftheNode (node root) {
        if (root==null) {
            return 0;
        }

        int left = heightOftheNode(root.left);
        int right = heightOftheNode(root.right);
        int max = Math.max(left,right);

        return max+1;
    }


    public static void main(String[] args) {

        node n1 = new node (10);

        node n2 = new node (5);
        node n3 = new node (2);
        node n4 = new node (8);
        node n5 = new node (20);
        node n6 = new node (30);
        node n7 = new node (40);

        n1.left =n2;
        n2.left = n3;
        n2.right = n4;
        n1.right = n5;
        n5.right = n6;
        n6.right =n7;


        System.out.println("The height of the node is : ");
        System.out.println(heightOftheNode(n1));
        System.out.println("The node of the tree is : " );
        System.out.println(nodeCount(n1));

    }
}
