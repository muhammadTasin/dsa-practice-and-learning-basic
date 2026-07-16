class LinkedList {
    Node head;

    public void append(Integer val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.elem);
            temp = temp.next;
        }
    }

    public void prepend(Integer val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public Node nodeAt(int index) {
        if (index < 0) {
            return null;
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        return current;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void removeLast() {

        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }
}
