import java.util.*;
public class nthLevel {
    public static class node {
        int value;
        node root;
        node left;
        node right;

        public node (int val){
            this.value =val;
        }
    }

    public static void getLevel (node root, int num) {
        if (root==null){
            return;
        }
        if (num ==1) {
            System.out.print(root.value + " ");
            return;
        }
        getLevel(root.left,num-1);
        getLevel(root.right,num-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which level do you want to print : ");
        int lev = sc.nextInt();

        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);
        node n5 = new node(5);
        node n6 = new node(6);
        node n7 = new node(7);

        n1.left = n2;
        n1.right = n3;

        n2.right = n4;
        n3.left = n5;

        n4.left = n6;
        n5.right = n7;

        getLevel(n1,lev);

    }
}
