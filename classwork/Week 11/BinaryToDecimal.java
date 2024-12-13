public class BinaryToDecimal {
    public static void main(String args[]) {
        int n = 1010111101;
        System.out.println(cal(n));
    }

    public static int cal(int n) {
        int pow = 0;
        int decimal = 0;
        do {
            decimal += (n % 10) * Math.pow(2, pow);
            pow++;
            n /= 10;
        }while(n > 0);
        return decimal;
    }
}