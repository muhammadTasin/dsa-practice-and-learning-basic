import java.util.*;
public class kth_Smallest_Element_Bst {
    public static class node {
        int value;
        node left;
        node right;

        public node(int value) {
            this.value = value;
        }
    }

        public static void inOrder (node root, ArrayList<Integer> val){
            if (root==null)return;
            inOrder(root.left,val);
            val.add(root.value);
            inOrder(root.right,val);


        }
        public static int getSmall (node root,int val){
        ArrayList<Integer> arr = new ArrayList<> ();
        inOrder(root,arr);
        return arr.get(val-1);
        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        node root = new node(31);

        root.left = new node(18);
        root.right = new node(80);

        root.left.left = new node(3);
        root.left.right = new node(24);

        root.right.left = new node(57);
        root.right.right = new node(112);

        root.left.left.left = new node(-4);
        root.left.left.right = new node(12);

        root.left.right.left = new node(21);
        root.left.right.right = new node(29);

        root.right.left.left = new node(45);
        root.right.left.right = new node(71);

        root.right.right.left = new node(93);
        root.right.right.right = new node(146);

        System.out.println("Enter k : ");
        int k = sc.nextInt();

        int result = getSmall(root, k);
        System.out.println(k + "th smallest element is: " + result);

    }
}
