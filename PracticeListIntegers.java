import java.util.*;

public class PracticeListIntegers{

  public static void main(String[] args)
  {
    List<Integer> integerList = new ArrayList<Integer>();
    integerList.add(108);
    integerList.add(29);
    integerList.add(56);
    integerList.set(2,99);
    Collections.sort(integerList);

    for(Integer in : integerList)
    {
      System.out.println("Printing the value of sorted data " + in);
    }


  }
}
