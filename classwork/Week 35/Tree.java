
import java.util.HashMap;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("US", 50);

        System.out.println(thm);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
    }
}