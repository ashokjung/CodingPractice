package Composition;
public class Composition {

    public static void main(String[] args)
   {
       Person person = new Person();
       System.out.println("*********** BEGIN ***********");
       System.out.println("\r\n");
       System.out.println("*********** Employee Information ***********");
       System.out.println("\r\n");
       System.out.println("ID     : "+person.getId());
       System.out.println("Role   : "+person.getRole());
       System.out.println("Salary : "+person.getSalary());
       System.out.println("\r\n");
       System.out.println("*********** Employee Information ***********");
       System.out.println("\r\n");
       System.out.println("*********** END   ***********");

   } 
}
