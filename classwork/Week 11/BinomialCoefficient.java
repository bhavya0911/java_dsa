public class BinomialCoefficient {
    public static void main(String args[]) {
        System.out.println(cal(5, 2));
    }   
    
    public static int cal(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        return fact_n / (fact_r * fact_nmr);
    }

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}