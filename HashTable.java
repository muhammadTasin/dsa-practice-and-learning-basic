public class HashTable {

    private static final int DEFAULT_CAPACITY = 10;
    private static final double MAX_LOAD_FACTOR = 0.75;

    private Node[] hashtable;
    private int size;

    public class Node {
        int key;
        String value;
        Node next;

        public Node(int key, String value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        hashtable = new Node[capacity];
    }

    public int hashfunction(int key) {
        return Math.floorMod(key, hashtable.length);
    }

    /**
     * Adds a key-value pair. If the key already exists, its value is replaced.
     *
     * @return the old value, or null when the key was not already present
     */
    public String put(int key, String value) {
        int index = hashfunction(key);

        for (Node current = hashtable[index]; current != null; current = current.next) {
            if (current.key == key) {
                String oldValue = current.value;
                current.value = value;
                return oldValue;
            }
        }

        hashtable[index] = new Node(key, value, hashtable[index]);
        size++;

        if ((double) size / hashtable.length > MAX_LOAD_FACTOR) {
            resize(hashtable.length * 2);
        }
        return null;
    }

    public String get(int key) {
        Node node = findNode(key);
        return node == null ? null : node.value;
    }

    public boolean containsKey(int key) {
        return findNode(key) != null;
    }

    /**
     * Removes a key and returns its value, or null if the key is absent.
     */
    public String remove(int key) {
        int index = hashfunction(key);
        Node current = hashtable[index];
        Node previous = null;

        while (current != null) {
            if (current.key == key) {
                if (previous == null) {
                    hashtable[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        hashtable = new Node[hashtable.length];
        size = 0;
    }

    private Node findNode(int key) {
        int index = hashfunction(key);
        for (Node current = hashtable[index]; current != null; current = current.next) {
            if (current.key == key) {
                return current;
            }
        }
        return null;
    }

    private void resize(int newCapacity) {
        Node[] oldTable = hashtable;
        hashtable = new Node[newCapacity];

        for (Node bucket : oldTable) {
            Node current = bucket;
            while (current != null) {
                Node next = current.next;
                int newIndex = hashfunction(current.key);
                current.next = hashtable[newIndex];
                hashtable[newIndex] = current;
                current = next;
            }
        }
    }
}
