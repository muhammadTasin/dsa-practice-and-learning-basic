public class LinkedList_Remove_Duplicates {
    /*
     * Problem: Remove Duplicates from a Sorted Linked List
     *
     * Given the head of a linked list whose values are sorted in ascending order,
     * remove every duplicate so that each value appears exactly once. Return the
     * head of the updated list.
     *
     * Example:
     * Input:  1 -> 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 4
     * Output: 1 -> 2 -> 3 -> 4
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static Node createList(int[] values) {
        if (values.length == 0) {
            return null;
        }

        Node head = new Node(values[0]);
        Node tail = head;

        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i]);
            tail = tail.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Node head = createList(new int[]{1, 1, 2, 3, 3, 4, 4, 4});

        System.out.println("Original list:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("After removing duplicates (expected: 1 -> 2 -> 3 -> 4):");
        printList(head);
    }
}
