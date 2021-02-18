import java.util.Hashtable;
import java.util.Map;
public class HashTable{

public static void main(String[] args)
{
    Hashtable<Integer,String> hashTable = new Hashtable<>(4);
    hashTable.put(1,"Abhay");
    hashTable.put(2,"Abhinav");
    hashTable.put(3,"Anand");
    hashTable.put(4,"Ashok");
    System.out.println("\r\n");
    System.out.println("Hash Table Mapping is "+ hashTable);
    System.out.println("\r\n");

    // Update the hashTable with a new key value pair

    hashTable.put(1,"Abhishek");
    System.out.println("\r\n");
    System.out.println("Updated Hash Table Mapping is "+ hashTable);
    System.out.println("\r\n");

    for(Map.Entry<Integer,String> table : hashTable.entrySet())
    {
        System.out.println(table.getKey()+ " " + table.getValue());
    }
    // Check to string for the hashTable
    hashTable.toString();
    System.out.println("Check to String "+ hashTable.toString());

    hashTable.size();
    System.out.println("Check the size of the hashTable "+ hashTable.size());

    // remove the key 3 and then printing the hashTable
    hashTable.remove(3);
    System.out.println("Check after removing Key 3 from the hashTable"+hashTable);

    // Clear the hashTable
    hashTable.clear();
    System.out.println("Printing hashTable after clear"+hashTable);

}

}
