package Multithreading;

public class FizzBuzz{

    public static void main(String[] args)
    {
        for(int i=0; i<110; i++){
            String output= "";
            if(i%3==0) { output +="Fizz";}
            if(i%5==0){output +="Buzz";}
            if(i%7==0){output +="Name";}
            if(output=="") {output =String.valueOf(i);}
            System.out.println(output);
        }

    }

}
