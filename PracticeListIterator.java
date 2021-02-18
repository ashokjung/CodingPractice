import java.util.*;


public class PracticeListIterator{

  public static void main(String[] args)
  {
   List<String> listofString = new ArrayList<String>();
   listofString.add("Name");
   listofString.add("Place");
   listofString.add("Animal");
   listofString.add("Thing");

   // Iterator for the list (for iteration )

   ListIterator<String>  iterator = listofString.listIterator();

   /*
   * traverse the list in the forward direction using hasNext
   */

    System.out.println("\r\n");
    System.out.println("Print in the forward direction \n");
   while(iterator.hasNext())
   {
     System.out.println("index: " + iterator.nextIndex() + " value: " + iterator.next());
   }

   /*
   * traverse the list in the backward direction using hasPrevious
   */
    System.out.println("\r\n");
    System.out.println("Print in the reverse direction \n");
   while(iterator.hasPrevious())
   {
     System.out.println("index: " + iterator.previousIndex() +" value: " + iterator.previous());
   }
   System.out.println("\r\n");
  }
}
