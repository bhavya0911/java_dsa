public class DecimalToBinary {
    public static void main(String args[]) {
        int n = 5;
        System.out.println(cal(n));
    }
    
    public static int cal(int n) {
        int binary = 0;
        int pow = 0;
        // if (n == 0) {
        //     return 0;
        // }
        do {
            int rem = n % 2;
            binary += (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }while(n > 0);
        return binary;
    }
}