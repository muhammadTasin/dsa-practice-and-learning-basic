import java.util.Scanner;

public class Count_BstNode_In_Range {

    public static class node {
        node left;
        node right;
        int value;

        public node (int value){
            this.value = value;
        }
    }

    public static int count (node root,int start, int end) {
        if (root==null)return 0;

        if (root.value<start){
            return count(root.right,start,end);
        }
        if (root.value>end){
           return count(root.left,start,end);
        }
        return 1+ count(root.right,start,end)+count(root.left,start,end);

    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        node n1 = new node(10);
        node n2 = new node(5);
        node n3 = new node(50);
        node n4 = new node(1);
        node n5 = new node(40);
        node n6 = new node(100);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.left = n5;
        n3.right = n6;


        System.out.println("Enter start : ");
        int start = sc.nextInt();
        System.out.println("Enter end : ");
        int end = sc.nextInt();

        boolean flag = false;
        if (count(n1,start,end)>-1){
            flag =true;
        }
        else {
            flag = false;
        }

        if (flag) {
            System.out.println("There are " + count(n1, start, end) + "  nodes");
        }

    }
}
