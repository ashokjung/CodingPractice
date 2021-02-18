public class Lexicographical{

    public static void main(String[] agrs)
    {

        String arrayOfString[] = {"c","cb","cba"};
        int arraylength =  arrayOfString.length;
        Lexicographical lexicographical = new Lexicographical();
        System.out.println("lexicographically Smallest String " + lexicographical.lexsmallest(arrayOfString, arraylength) );
    }

    public String lexsmallest(String arrayOfString[], int arraylength)
    {
        String result = "";
        sort(arrayOfString,arraylength);
        for(int i=0 ; i < arraylength; i++){
            result += arrayOfString[i] ;
        }

        return result;
    }

    public void sort(String arrayofString[], int arraylength)
    {


        for(int i =0 ; i < arraylength ; i++){

            for(int j=i +1; j< arraylength ; j++){

                if((arrayofString[i]+arrayofString[j]).compareTo(arrayofString[j]+arrayofString[i])>0)
                {

                    String data = arrayofString[i];
                    arrayofString[i] = arrayofString[j];
                    arrayofString[j] = data;
                 }

            }

        }
    }

}