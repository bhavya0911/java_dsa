public class PowerTwo {
    public static void main(String args[]) {
        check(5);
        check(16);
        check(12);
        check(4);
        check(8);
    }

    public static void check(int n) {
        if((n & (n-1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not Power of 2");
        }
    }
}