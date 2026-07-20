
public class HashTable {


    private FruitNode[] ht;



    public HashTable(int size){
        this.ht = new FruitNode[size];
    }



    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }


    private int hashFunction( String key ){
        long sum = 0;
        int start = key.length() % 2 == 0 ? 0 : 1;
        for (int i = start; i < key.length(); i += 2) {
            sum += key.charAt(i);
        }
        return (int) Math.floorMod(sum, ht.length);
    }





    public void insert(String key, Integer value){
        int index = hashFunction(key);
        FruitNode current = ht[index];
        FruitNode previous = null;

        while (current != null && !current.fruit[0].equals(key)) {
            previous = current;
            current = current.next;
        }

        FruitNode node;
        if (current == null) {
            node = new FruitNode(key, value);
        } else {
            if (previous == null) {
                ht[index] = current.next;
            } else {
                previous.next = current.next;
            }
            current.fruit[1] = value;
            current.next = null;
            node = current;
        }

        if (ht[index] == null || value > (Integer) ht[index].fruit[1]) {
            node.next = ht[index];
            ht[index] = node;
            return;
        }

        current = ht[index];
        while (current.next != null && (Integer) current.next.fruit[1] >= value) {
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }

}
