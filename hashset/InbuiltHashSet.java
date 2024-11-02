package hashset;
import java.util.HashSet;

public class InbuiltHashSet {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("A");
        cars.add("B");
        cars.add("C");
        cars.add("A");
        System.out.println(cars.size());
    }

}
