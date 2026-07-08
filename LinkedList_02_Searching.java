public class LinkedList_02_Searching {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = createList(new int[]{5, 10, 15, 10, 25});

        printList(head);

        System.out.println("Expected contains 15: true");
        System.out.println("Your contains 15: " + contains(head, 15));

        System.out.println("Expected index of 10: 1");
        System.out.println("Your index of 10: " + indexOf(head, 10));

        System.out.println("Expected count of 10: 2");
        System.out.println("Your count of 10: " + countOccurrences(head, 10));
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

    public static boolean contains(Node head, int target) {
        // TODO: Return true if target exists in the list, otherwise false.

        Node temp = head;

        while (temp != null) {
            if (temp.data == target) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public static int indexOf(Node head, int target) {
        // TODO: Return the first index of target. If not found, return -1.
        // Hint: First node index is 0.

        Node temp = head;
        int firstIndex=0;

        while (temp!=null){
            if (temp.data==target){
                return firstIndex;
            }
            temp = temp.next;
            firstIndex++;
        }
        return -1;
    }

    public static int countOccurrences(Node head, int target) {
        // TODO: Count how many times target appears in the list.
        Node temp = head;
        int counter =0;

        while (temp!=null) {
            if (temp.data == target) {
                counter++;
            }
            temp = temp.next;
        }


        return counter;
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
