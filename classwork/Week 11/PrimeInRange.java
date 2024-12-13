public class PrimeInRange {
    public static void main(String args[]) {
        inRange(200);
    }

    public static void inRange(int n) {
        for(int i = 2; i <= n; i++) {
            if(checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkPrime(int n) {
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}