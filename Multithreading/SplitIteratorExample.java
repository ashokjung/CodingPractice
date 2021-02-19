package Multithreading;
import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorExample {

    public static void main(String[] args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Nissan");
        cars.add("BMW");
        cars.add("Maruthi");
        cars.add("Audi");

        Spliterator<String> s = cars.spliterator();
        int values = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.DISTINCT  | Spliterator.IMMUTABLE;

        System.out.print(values);
        System.out.println(Spliterator.ORDERED );
        System.out.println(Spliterator.SIZED );
        System.out.println(Spliterator.DISTINCT );
        System.out.println("Output of the characteristics:" + s.hasCharacteristics(s.characteristics()));

        if(s.hasCharacteristics(Spliterator.ORDERED))
        System.out.println("Characteristic is Ordered");

        if(s.hasCharacteristics(Spliterator.SIZED))
        System.out.println("Characteristic is Sized");

        if(s.hasCharacteristics(Spliterator.IMMUTABLE))
        System.out.println("Characteristic is Immutable");

    }
    
}
