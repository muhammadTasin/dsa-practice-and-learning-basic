import java.util.*;
public class heightOfComplexTree {

    public static class node {
        int value;
        node left;
        node right;

        public node(int value) {
            this.value = value;
        }
    }


        public static int getHeight(node root) {
            if (root == null) {
                return 0;
            }
            int leftValue = getHeight(root.left);
            int rightVlue = getHeight(root.right);
            int maxVal = 1 + Math.max(leftValue, rightVlue);
            return maxVal;

        }


    public static void main(String[] args) {

        node n1 = new node(25);
        node n2 = new node(30);
        node n3 = new node(40);
        node n4 = new node(42);// right =60
        node n5 = new node(49);
        node n6 = new node(52);
        node n7 = new node(59);
        node n8 = new node(55);
        node n9 = new node(58);
        node n10 = new node(60);
        node n11 = new node(63);
        node n12 = new node(65);

        n1.left =n2;
        n1.right = n3;
        n2.left =n4;
        n2.right = n5;
        n4.left = n8;
        n4.right = n9;
        n5.left =n10;
        n3.left = n6;
        n3.right = n7;
        n6.left =n11;
        n11.left =n12;

        System.out.println("Max node is ");
        System.out.println(getHeight(n1));


    }
}

