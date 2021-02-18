public class PracticeArrayCustom {

    public int rollNumber;
    public String name;

    /*
    * Adding a parameterized Constructor
    */
    public PracticeArrayCustom(int rollNumber, String name)
    {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public static void main(String[] args)
    {
        PracticeArrayCustom[] customarray;
        customarray = new PracticeArrayCustom[5];

        customarray[0] = new PracticeArrayCustom(1,"Ashok");
        customarray[1] = new PracticeArrayCustom(2,"Jhon");
        customarray[2] = new PracticeArrayCustom(3,"Nick");
        customarray[3] = new PracticeArrayCustom(4,"Addy");
        customarray[4] = new PracticeArrayCustom(5,"Nathan");

        for(int i = 0 ; i < customarray.length; i++)
        {
            System.out.println("Student with Sitting position " + i + " , "+" has a roll number " + customarray[i].rollNumber + ", and the name is " + customarray[i].name);
        }
    }

}
