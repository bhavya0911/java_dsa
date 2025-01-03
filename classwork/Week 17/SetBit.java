public class SetBit {
    public static void main(String args[]) {
        System.out.println(set(10, 2));
    }

    public static int set(int n, int pos) {
        int bitMask = 1 << pos;
        return n | bitMask;
    }
}
