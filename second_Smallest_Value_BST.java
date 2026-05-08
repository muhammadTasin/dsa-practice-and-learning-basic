import java.util.*;
public class second_Smallest_Value_BST {
    public static class node {
        int value;
        node left;
        node right;

        public node(int value) {
            this.value = value;
        }
    }

        public static int get2ndSmallest(node root) {
            if (root == null) {
                return 0;
            }
            node temp = root;
            int counter = 0;
            while (temp.left != null) {
                temp = temp.left;
                counter++;
            }
            if (counter==0 && root.right ==null){
                return 0;
            }
            temp =root;
            for (int i = 1; i < counter; i++) {
                temp = temp.left;
            }
            return temp.value;
        }




    public static void main(String[] args) {

        node n1 = new node(50);
        node n2 = new node(30);
        node n3 = new node(70);
        node n4 = new node(20);
        node n5 = new node(40);
        node n6 = new node(60);
        node n7 = new node(80);
        node n8 = new node(10);
        node n9 = new node(25);
        node n10 = new node(55);
        node n11 = new node(65);
        node n12 = new node(90);

        n1.left = n2;     // 50 -> 30
        n1.right = n3;    // 50 -> 70

        n2.left = n4;     // 30 -> 20
        n2.right = n5;    // 30 -> 40

        n3.left = n6;     // 70 -> 60
        n3.right = n7;    // 70 -> 80

        n4.left = n8;     // 20 -> 10
        n4.right = n9;    // 20 -> 25

        n6.left = n10;    // 60 -> 55
        n6.right = n11;   // 60 -> 65

        n7.right = n12;   // 80 -> 90

        System.out.println("The 2nd smallest of the binary search tree is : ");
        System.out.println(get2ndSmallest(n1));

    }
}

