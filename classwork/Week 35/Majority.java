
import java.util.HashMap;

public class Majority {
    public static void main(String[] args) {
        int array[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        for (Integer key: map.keySet()) {
            if(map.get(key) > array.length / 3) {
                System.out.println(key);
            }
        }
    }    
}