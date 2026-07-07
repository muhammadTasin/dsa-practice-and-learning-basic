import java.util.*;
public class FindMaxNodeValue {
    public static class node {

        int value;
        node left;
        node right;

        public  node (int value){
            this.value =value;
        }
    }

    public static int getMax (node root){
         if(root ==null){
             return 0;
         }
         int left = getMax(root.left);
         int right = getMax(root.right);
         int max = Math.max(left,right);

         return Math.max(root.value,max);

         //return root.value+ Math.max(getMax(root.left),getMax(root.right));
    }

    public static void main(String[] args) {

        node n1 = new node(25);
        node n2 = new node(39);
        node n3 = new node(41);
        node n4 = new node(42);
        node n5 = new node(43);
        node n6 = new node(45);
        node n7 = new node(69);
        node n8 = new node(75);
        node n9 = new node(80);

        node n10 = new node( 50);
        node n11 = new node( 52);
        node n12 = new node(55);
        node n13 = new node(58);
        node n14 = new node(77);

        n1.left = n2;
        n2.left =n3;
        n2.right = n4;
        n3.left = n5;
        n3.right = n6;
        n6.left = n7;
        n6.right =n8;
        n8.left =n9;

        n1.right = n10;
        n10.left = n11;
        n10.right = n12;
        n12.right = n14;
        n11.left = n13;

        System.out.println("And the highest node is : ");
        System.out.println(getMax(n1));

    }
}
