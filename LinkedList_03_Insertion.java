public class LinkedList_03_Insertion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = createList(new int[]{10, 20, 30});

        System.out.println("Original:");
        printList(head);

        head = insertAtBeginning(head, 5);
        System.out.println("After insert at beginning, expected: 5 10 20 30");
        printList(head);

        head = insertAtEnd(head, 40);
        System.out.println("After insert at end, expected: 5 10 20 30 40");
        printList(head);

        head = insertAtIndex(head, 2, 15);
        System.out.println("After insert at index 2, expected: 5 10 15 20 30 40");
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

    public static Node insertAtBeginning(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public static Node insertAtIndex(Node head, int index, int value) {


        Node n1 = new Node(value);
        Node temp = head;
        int counter=0;

        if (index<0){
            return head;
        }
        if (index ==0){
            n1.next =head;
            return n1;
        }


        while (temp!=null && counter<index-1){
            temp=temp.next;
            counter++;
        }

        if (temp==null){
            return head;
        }

        n1.next =temp.next;
        temp.next =n1;

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
