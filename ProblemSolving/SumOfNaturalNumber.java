package ProblemSolving;

public class SumOfNaturalNumber {
    

    public static void main(String[] args){

        int n =500;
                       
        long startTime = System.nanoTime();
        System.out.println( SumOfNaturalNumber.sumOfNaturalNumber(n));
        long endTime = System.nanoTime();
        long timetaken = endTime-startTime;
        System.out.println("Time of execution "+ timetaken);

        long startTime1 = System.nanoTime();
        System.out.println(SumOfNaturalNumber.sumOfNaturalNumberUsingLoop(n));
        long endTime1= System.nanoTime();
        long timetaken1 = endTime1-startTime1;
        System.out.println("Time of execution "+ timetaken1);


        long startTime2 = System.nanoTime();
        System.out.println(SumOfNaturalNumber.sumOfNaturalNumberUsingLoops(n));
        long endTime2= System.nanoTime();
        long timetaken2 = endTime2-startTime2;
        System.out.println("Time of execution "+ timetaken2);

    }
 

     /*
     * Complexity 0(1)
     */
    public static int sumOfNaturalNumber(int n){

      return (n*(n+1))/2;
    }


     /*
     * Complexity 0(n)
     */
    public static int sumOfNaturalNumberUsingLoop(int n){
        
        int sum = 0;
        for ( int i =0 ; i <=n; i++){
            sum = sum + i;
        }
        return sum;
    }

    /*
     * Complexity 0(n2)
     */
    public static int sumOfNaturalNumberUsingLoops(int n){
        int sum =0;
        for(int i =1 ; i<=n;i++){
            for(int j =1 ; j <=i ; j++){
                sum++;
            }

        }

        return sum;
    }

}
