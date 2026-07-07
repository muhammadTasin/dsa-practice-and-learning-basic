import java.util.*;
public class BST_Max_Min_Finder {
    public static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static int getMin(Node root) {
        if (root == null) return 0;

        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
    return temp.value;

    }

    public static int getMax(Node root) {
        if (root == null) return 0;

        Node temp = root;
        while (temp.right!=null){
            temp = temp.right;
        }
        return temp.value;
    }


    public static void main(String[] args) {

        Node n1 = new Node(50);
        Node n2 = new Node(30);
        Node n3 = new Node(70);
        Node n4 = new Node(20);
        Node n5 = new Node(40);
        Node n6 = new Node(60);
        Node n7 = new Node(80);
        Node n8 = new Node(10);
        Node n9 = new Node(25);
        Node n10 = new Node(55);
        Node n11 = new Node(65);
        Node n12 = new Node(90);


        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        n4.left = n8;
        n4.right = n9;

        n6.left = n10;
        n6.right = n11;

        n7.right = n12;

        System.out.println("Lowest value of the BST is ");
        System.out.println(getMin(n1));

        System.out.println("Lowest value of the BST is ");
        System.out.println(getMax(n1));

    }
}
