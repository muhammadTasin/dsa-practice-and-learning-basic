import java.util.*;
public class postOrder {

    public static class node {

        int value;
        node left;
        node right;

        public node(int value) {
            this.value = value;
        }
    }

        public static void post (node root){
            if (root == null){
                return;
            }
            post(root.left);
            post(root.right);
            System.out.println(root.value);
        }



    public static void main(String[] args) {

        node n1 = new node (1);
        node n2 = new node (2);
        node n3 = new node (3);
        node n4 = new node (4);
        node n5 = new node (5);
        node n6 = new node (6);
        node n7 = new node (7);

        n1.left = n2;
        n2.left = n4;
        n2.right = n5;
        n1.right = n3;
        n3.left =n6;
        n3.right = n7;

        System.out.println("Post order traversal : ");
        post(n1);
    }
}
