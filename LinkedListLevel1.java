public class LinkedListLevel1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    Node head;
    // 1. Add new node at the end
    public void addLast(int data) {

        Node newNode = new Node(data);
        if (head ==null){
            head = newNode;
            return;
        }
        Node temp = head;


        while (temp.next!=null){
            temp =temp.next;
        }
        temp.next = newNode;

        // TODO: create new node
        // TODO: if head is null, make it head
        // TODO: otherwise go to last node and connect new node
    }

    // 2. Print all nodes
    public void printList() {

        Node temp = head;

        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        // TODO: start from head
        // TODO: print each node data
        // TODO: move to next node
    }

    // 3. Count number of nodes
    public int size() {
        // TODO
        Node temp = head;
        int count =0;

        while (temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    // 4. Search a value
    public boolean search(int key) {

        Node temp = head;
        boolean flag = false;

        if (temp ==null){
            return  false;
        }

        while (temp!=null){
            if (temp.data ==key){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        // TODO
        return flag;
    }

    public static void main(String[] args) {
        LinkedListLevel1 list = new LinkedListLevel1();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.printList();

        System.out.println("Size: " + list.size());
        System.out.println("Found 20? " + list.search(20));
        System.out.println("Found 99? " + list.search(99));
    }
}