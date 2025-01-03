public class CheckOddOrEven {
    public static void main(String args[]) {
        check(5);
        check(10);
        check(20);
    }

    public static void check(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
