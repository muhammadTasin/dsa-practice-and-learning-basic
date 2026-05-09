import java.util.*;
public class insert_BST {
    public static class node {
        node right;
        node left;
        int value;

        public node(int value) {
            this.value = value;
        }
    }

    public static int insert(node root, int x,int y) {
        if (root == null) return 0;
        node temp =root;
        while (temp!=null){
            if (temp.value==x){
                return temp.value =y;
            }
            temp=temp.left;
        }
        temp =root;
        while (temp!=null){
            if(temp.value==x){
                return temp.value=y;
            }
            temp =temp.right;
        }
        return -1;
    }

    public static void prinTree (node root){
        if (root==null) return;

        prinTree(root.left);
        System.out.println(root.value+" ");
        prinTree(root.right);
    }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            node n1 = new node(31);
            node n2 = new node(18);
            node n3 = new node(80);
            node n4 = new node(3);
            node n5 = new node(24);
            node n6 = new node(57);
            node n7 = new node(112);
            node n8 = new node(-4);
            node n9 = new node(12);
            node n10 = new node(21);
            node n11 = new node(29);
            node n12 = new node(45);
            node n13 = new node(71);
            node n14 = new node(93);
            node n15 = new node(146);

            n1.left = n2;      // 31 -> 18
            n1.right = n3;     // 31 -> 80

            n2.left = n4;      // 18 -> 3
            n2.right = n5;     // 18 -> 24

            n3.left = n6;      // 80 -> 57
            n3.right = n7;     // 80 -> 112

            n4.left = n8;      // 3 -> -4
            n4.right = n9;     // 3 -> 12

            n5.left = n10;     // 24 -> 21
            n5.right = n11;    // 24 -> 29

            n6.left = n12;     // 57 -> 45
            n6.right = n13;    // 57 -> 71

            n7.left = n14;     // 112 -> 93
            n7.right = n15;    // 112 -> 146


            System.out.println("Enter Target number : ");
            int num = sc.nextInt();
            System.out.println("Enter which number want to insert  : ");
            int target = sc.nextInt();


            int result = insert(n1,num,target);
            if(result!=-1){
                System.out.println("After inserting : " );
                prinTree(n1);
            }
            else {
                System.out.println("Target not found ");
            }
        }
    }

