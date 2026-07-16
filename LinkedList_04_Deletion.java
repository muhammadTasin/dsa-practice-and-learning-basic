public class LinkedList_04_Deletion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = createList(new int[]{5, 10, 15, 20, 25});

        System.out.println("Original:");
        printList(head);

        head = deleteFirst(head);
        System.out.println("After delete first, expected: 10 15 20 25");
        printList(head);

        head = deleteLast(head);
        System.out.println("After delete last, expected: 10 15 20");
        printList(head);

        head = deleteByValue(head, 15);
        System.out.println("After delete value 15, expected: 10 20");
        printList(head);
    }

    public static Node createList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static Node deleteFirst(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    public static Node deleteLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    public static Node deleteByValue(Node head, int value) {
        if (head == null) {
            return null;
        }

        if (head.data == value) {
            return head.next;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
