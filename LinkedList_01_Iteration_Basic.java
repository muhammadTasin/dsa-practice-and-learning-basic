public class LinkedList_01_Iteration_Basic {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = createSampleList();

        System.out.println("Expected print: 10 20 30 40");
        System.out.print("Your print: ");
        printList(head);

        System.out.println("Expected count: 4");
        System.out.println("Your count: " + countNodes(head));

        System.out.println("Expected sum: 100");
        System.out.println("Your sum: " + sumNodes(head));
    }

    public static Node createSampleList() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        return head;
    }

    public static void printList(Node head) {
        // TODO: Start from head and print every node data until current becomes null.
        Node temp = head;

        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println();
    }

    public static int countNodes(Node head) {
        // TODO: Count how many nodes are in the linked list.

        int count =0;
        Node temp =head;
        while (temp!=null){
            temp= temp.next;
            count++;
        }

        return count;
    }

    public static int sumNodes(Node head) {
        // TODO: Add all node data values and return the sum.
        int sum =0;

        Node temp = head;

        while (temp!=null){
            sum+=temp.data;
            temp = temp.next;
        }

        return sum;
    }
}
