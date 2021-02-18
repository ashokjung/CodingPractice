public class PracticeArray{

  public static void main(String[] args)
  {
    int[] arrayOfInteger = new int[5];
    arrayOfInteger[0] = 5;
    arrayOfInteger[1] = 10;
    arrayOfInteger[2] = 15;
    arrayOfInteger[3] = 20;
    arrayOfInteger[4]= 25;

    for(int i =0 ; i< arrayOfInteger.length; i++)
    {
      System.out.println("Element at index "+ i + " is:" + arrayOfInteger[i]);
    }

  }
}
