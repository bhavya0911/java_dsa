public class OptPow {

    public static int pow(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = pow(x, n/2);
        halfPower = halfPower * halfPower;
        
        if(n % 2 != 0 ) {
            halfPower *= x;
        }
        return halfPower;
    }
    public static void main(String args[]) {
        int x = 2, y = 30;
        System.out.println(pow(x, y));
    } 
}