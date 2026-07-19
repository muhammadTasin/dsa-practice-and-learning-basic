public class remove_middle_elemnt_singlyList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /*
     * QUESTION: Remove the Middle Element of a Singly Linked List
     *
     * Complete removeMiddle so it removes the middle node and returns the head.
     *
     * Rules:
     * 1. If the list has an odd number of nodes, remove the one middle node.
     * 2. If the list has an even number of nodes, remove the second middle node.
     *    Example: 10 -> 20 -> 30 -> 40 removes 30.
     * 3. If the list has one node, return null.
     * 4. If the list is empty, return null.
     * 5. Try to solve it in one traversal using two pointers.
     *
     * Target complexity:
     * Time: O(n)
     * Extra space: O(1)
     */
    public static Node removeMiddle(Node head) {

        if (head==null|| head.next ==null){
            return null;
        }

        Node temp = head;
        int counter =0;
        while (temp!=null){
            counter++;
            temp= temp.next;
        }

        int isPos = counter/2;

        temp = head;


        for (int i = 0; i < isPos-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        test(new int[]{10, 20, 30, 40, 50}, "10 20 40 50");
        test(new int[]{10, 20, 30, 40}, "10 20 40");
        test(new int[]{10, 20}, "10");
        test(new int[]{10}, "empty");
        test(new int[]{}, "empty");
    }

    // -------------------- Helper functions --------------------

    public static Node createList(int[] values) {
        if (values.length == 0) {
            return null;
        }

        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(Node head) {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void test(int[] values, String expected) {
        Node head = createList(values);

        System.out.println("Expected: " + expected);
        System.out.print("Your result: ");
        printList(removeMiddle(head));
        System.out.println();
    }
}
