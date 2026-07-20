
public class HashTable {


    private PairNode[] ht;



    public HashTable(int size){
        this.ht = new PairNode[size];
    }



    public void createFromArray(Object[][] arr){
        for( Object[] x: arr )
            this.insert( x );
    }




    public void insert(Object[] keyValuePair){
        String key = (String)keyValuePair[0];
        Integer value = (Integer)keyValuePair[1];
        String srchResult = this.searchHashtable(keyValuePair);
        if ( srchResult==null ) {
            System.out.println("Incomplete searchHashTable() and hashFunction() method");
        } else if ( srchResult.equals( "Found" ) ){
            System.out.println("("+key+","+value+") already Inserted. Cannot reinsert.");
        } else {
            int hashedIndex = this.hashFunction( key );
            PairNode newPNode = new PairNode( key, value );
            if ( this.ht[hashedIndex] == null ){
                this.ht[hashedIndex] = newPNode;
            } else {
                newPNode.next = this.ht[hashedIndex];
                this.ht[hashedIndex] = newPNode;
            }
        }
    }



    public void printHashTable(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" : " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("(Key: "+pNode.key+", Value: "+pNode.value+") --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }


    private int hashFunction( String key ){
        long sum = 0;
        for (int i = 0; i < key.length(); i += 2) {
            char first = key.charAt(i);
            char second = i + 1 < key.length() ? key.charAt(i + 1) : 'N';
            String combined = Integer.toString(first) + Integer.toString(second);
            sum += Long.parseLong(combined);
        }
        return (int) Math.floorMod(sum, ht.length);
    }




    public String searchHashtable( Object[] keyValuePair ){
        String key = (String) keyValuePair[0];
        int index = hashFunction(key);
        PairNode current = ht[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return "Found";
            }
            current = current.next;
        }
        return "Not Found";
    }

}
