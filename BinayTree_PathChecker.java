import java.util.*;

public class BinayTree_PathChecker {
    static class node {
        int elem;
        node left;
        node right;

        node(int elem) {
            this.elem = elem;
        }
    }

    public static String check(node root, int[] seq) {
        if (root == null || seq == null || seq.length == 0) {
            return "Missing";
        }
        return checkpath(root, seq, 0);
    }

    public static String checkpath(node root, int[] seq, int index) {
        if (root == null || index >= seq.length) {
            return "Missing";
        }

        if (root.elem != seq[index]) {
            return "Missing";
        }

        if (root.left == null && root.right == null) {
            return index == seq.length - 1 ? "Found" : "Missing";
        }

        String leftResult = checkpath(root.left, seq, index + 1);
        if (leftResult.equals("Found")) {
            return "Found";
        }

        return checkpath(root.right, seq, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
