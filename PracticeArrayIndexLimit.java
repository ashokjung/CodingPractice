public class PracticeArrayIndexLimit{

  public static void main(String[] args)
  {
    int[] arrayOfInteger = new int[2];

    arrayOfInteger[0] =1;
    arrayOfInteger[1]=2;
    arrayOfInteger[2] =3;

    for(int i = 0 ; i < arrayOfInteger.length ; i ++)
    {
      System.out.println("Element at " + i + " is "+ arrayOfInteger[i]);
    }
  }
}
