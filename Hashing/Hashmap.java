import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();


        // Basic methods on Hashmap 


        hm.put("Bhavishya", 8);
        hm.put("Raman", 7);
        hm.put("Akshay", 9);

        System.out.println(hm);

        System.out.println(hm.remove("Raman"));
        System.out.println(hm);

        System.out.println(hm.get("Akshay"));
        System.out.println(hm.size());
        System.out.println(hm.containsKey("Bhavishya"));

        hm.clear();
        System.out.println(hm.isEmpty());

        hm.put("Bhavishya", 8);
        hm.put("Raman", 7);
        hm.put("Akshay", 9);


        // to iterate on a hashmap 
        Set<String> keys = hm.keySet();

        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key : " + k + ", Value : " + hm.get(k));
        }


    }
}
