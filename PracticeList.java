import java.util.*;

public class PracticeList{

  public static void main(String[] args)
  {

    List<String> listofStrings = new ArrayList<>();
    listofStrings.add("Hello");
    listofStrings.add("Marry");
    listofStrings.add("Welcome");
    listofStrings.set(1,"MainCode");
    Collections.sort(listofStrings);

    for( String name:listofStrings)
    {
      System.out.println(name);
    }

  }
}
