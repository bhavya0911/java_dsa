public class ClearBit {
    public static void main(String args[]) {
        System.out.println(clear(10, 1));
    }

    public static int clear(int n, int pos) {
        int bitMask = ~(1 << pos);
        return n & bitMask;
    }
}
