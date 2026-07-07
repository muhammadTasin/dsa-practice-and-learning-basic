import java.util.*;
public class SizeOfTree {

    public static class node {
        int element;
        node right;
        node left;

        public node(int val) {
            this.element = val;
        }
    }
        public static  int getSize (node root) {
            if (root== null){
                return 0;
            }
            return getSize(root.left)+getSize(root.right)+1;

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        node root = new node(1);
        node a = new node(2);
        node b = new node(3);
        node c = new node(4);
        node d = new node(5);
        node e = new node(6);
        node f = new node(7);

        root.left = a;
        a.left = c;
        a.right = d;
        root.right = b;
        b.left = e;
        e.left = f;

        System.out.println(getSize(root));


    }
}
