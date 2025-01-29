
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        int value = 590;
        int countOfCoins = 0;
        Integer den[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(den, Comparator.reverseOrder());


        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < den.length; i++) {
            if(den[i] <= value) {
                while(den[i] <= value) {
                    countOfCoins++;
                    ans.add(den[i]);
                    value -= den[i];
                }
            }
        }

        System.out.print("total (min) coins used = " + countOfCoins);
        System.out.println("coin used");

        for(int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}