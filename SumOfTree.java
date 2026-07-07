import java.util.*;
public class SumOfTree {

    public static class node {
        int elem;
        node right;
        node left;

        public node (int root){
        this.elem = root;
        }
    }
    public static int getSum(node root ){
        if (root ==null){
            return 0;
        }
        return root.elem+getSum(root.left)+getSum(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base case : ");
        int n = sc.nextInt();

        node root = new node(n);
        node a = new node(2);
        node b = new node(3);
        node c = new node(4);
        node d = new node(5);
        node e = new node(7);
        node f = new node(6);

        root.left =a;
        a.left =c;
        a.right =d;
        root.right =b;
        b.left =f;
        b.right =e;

        System.out.println("And the sum is : ");
        System.out.println(getSum(root));
    }
}
