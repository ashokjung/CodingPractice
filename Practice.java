public class Practice{

    public static void  main(String[] args)
    {

        Practice practice = new Practice();
        int a = 40 ;
        int b = 80; 
        System.out.println("Sum of the number is "+practice.Sum(a, b));
        System.out.println("Difference of the number is "+practice.difference(a, b));
        System.out.println("Multiplication of the number is "+practice.multiply(a, b));
        System.out.println("Division of the number is "+practice.divide(a, b));

    }

     // Method to return the Sum of the two number
    public int  Sum(int a  , int b )
    {
        return a+b;
    }
    
    // Method to retun the difference of the two number
    public int difference (int a , int b)
    {
        return b>a ? b-a : a-b;
              
    }

    //Method to return multiplication of the two number
    public int multiply(int a , int b)
    {
        return a*b;
    }
    
    //Method to return division of the two number
    public int divide(int a , int b)
    {
        return  b>a ? b/a : a/b ;
    }

}