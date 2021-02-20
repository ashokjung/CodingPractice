import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassLoaderSubSystem {


       
        public static void main(String[] args)
    {
        // Getting hold of Class object created 
        // by JVM. 
        Student student = new Student();

        // Alternate way Class is generic, 
        //if you don't care for the warning you have two choices use 
        //@SuppressWarnings("rawtypes") to suppress warning

        @SuppressWarnings("rawtypes")
        Class _class  = student.getClass();
        // use the <?>

        Class<?> _classDef  = student.getClass();
             

        // Printing type of object using
        System.out.println(_class);


        Method m[] = _class.getDeclaredMethods();

        for(Method method :m)
        {
            System.out.println(method.getName());
        }

        Field f[] = _classDef.getDeclaredFields();

        for( Field field : f){
            System.out.println(field.getName());

        }

    }
    
}

class Student{

    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

}
