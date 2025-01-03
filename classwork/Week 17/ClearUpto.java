public class ClearUpto {
    public static void main(String args[]) {
        System.out.println(clearUpto(15, 2));
    }

    public static int clearUpto(int n, int pos) {
        int bitMask = (~0) << pos;
        return n & bitMask;
    }
}
