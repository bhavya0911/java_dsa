public class ClearRange {
    public static void main(String args[]) {
        System.out.println(clear(10, 2, 4));
    }

    public static int clear(int n, int start, int end) {
        int a =  (~0) << end + 1;
        int b = (1 << start) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
}
