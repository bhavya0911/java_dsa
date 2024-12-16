public class MaxSubSum {
    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        System.out.println(bruteForce(numbers));
        System.out.println(prefixSum(numbers));
        System.out.println(Kadane(numbers));
    }
    
    public static int bruteForce(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i ++) {
            for(int j = i; j < numbers.length; j++) {
                int currentSum = 0;
                for(int n = i; n <= j; n++) {
                    currentSum += numbers[n];
                }
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static int prefixSum(int numbers[]) {
        int maxSum = 0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for(int i = 0; i < numbers.length; i ++) {
            for(int j = i; j < numbers.length; j++) {
                int currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static int Kadane(int numbers[]) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if(currentSum < 0) {
                currentSum = 0;
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}