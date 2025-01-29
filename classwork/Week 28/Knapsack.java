
import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int maxWeight = 50;
        int maxValue = 0;
        double valuePerWeight[][] = new double[value.length][2];

        for(int i = 0; i < valuePerWeight.length; i++) {
            valuePerWeight[i][0] = i;
            valuePerWeight[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(valuePerWeight, Comparator.comparingDouble(o -> o[1]));

        for(int i = valuePerWeight.length - 1; i >= 0; i--) {
            int index = (int) valuePerWeight[i][0];
            if(maxWeight >= weight[index]) {
                maxValue += value[index];
                maxWeight -= weight[index];
            } else {
                maxValue += (valuePerWeight[i][1] * maxWeight);
                maxWeight = 0;
                break;
            }
        }
        System.out.println(maxValue);
    }
}