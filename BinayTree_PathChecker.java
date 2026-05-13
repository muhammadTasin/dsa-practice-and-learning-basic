import java.util.*;
public class BinayTree_PathChecker {
    class node {
        int elem;
        node left;
        node right;

        node(int elem) {
            this.elem = elem;
        }
    }
    public static String check (node root,int [] seq){
        if (root==null || seq == null || seq.length == 0) {
            return "missing";
        }
        return checkpath(root,seq,0);
    }

    public static String checkpath (node root, int[]seq, int index ){
        if (root==null){
            return "Missing";
        }
        if (root.elem!= seq[index]){
            return "Missing";
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



    }
}
