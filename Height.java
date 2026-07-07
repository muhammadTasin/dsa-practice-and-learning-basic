import java.util.*;
public class Height {

    public static class node {
        int value;
        node left;
        node right;

        public node (int elem){
            this.value =elem;

        }
    }
    public static int getHeight (node root){
        if (root == null){
            return 0;
        }
        int leftHeight  = getHeight(root.left);
        int rightHeight  = getHeight(root.right);

        return 1+Math.max(leftHeight,rightHeight);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base case : " );
        int n = sc.nextInt();

        node root = new node(n);
        node a = new node(2);
        node b = new node(4);
        node c = new node(5);
        node d = new node(3);
        node e = new node(6);
        node f = new node (7);

        root.left = a;
        a.left = b;
        a.right =c;
        root.right =d;
        d.left =e;
        e.left =f;

        System.out.println("Height of the tree is : ");
        System.out.println(getHeight(root));


    }
}
