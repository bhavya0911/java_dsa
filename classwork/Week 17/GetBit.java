public class GetBit {
    public static void main(String args[]) {
        System.out.println(get(10, 2));
    }

    public static int get(int n, int pos) {
        int bitMask = 1 << pos;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
