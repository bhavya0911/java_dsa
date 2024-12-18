import java.util.Arrays;
import java.util.Collections;

public class InBuilt {
    public static void main(String args[]) {
        Integer arr[] = {5, 4, 1, 3, 2};
        sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(Integer numbers[]) {
        Arrays.sort(numbers, 0, 3, Collections.reverseOrder());
    }
}