package hashmap;
import java.util.HashMap;

public class InbuiltHashMap {
    public static void main(String[]args){
        HashMap<String,String> cars =new HashMap<String,String>();
        cars.put("car1","Car A");
        cars.put("car2","Car B");
        cars.put("car3","Car C");
        cars.put("car4","Car D");
    

        System.out.println(cars.get("car3"));

    }
}
