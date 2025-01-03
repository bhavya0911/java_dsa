public class UpdateBit {
    public static void main(String args[]) {
        System.out.println(update(10, 2, 1));
    }

    public static int update(int n, int pos, int newBit) {
        int bitMask = ~(1 << pos);
        int cleared = n & bitMask;
        int setBitMask = newBit << pos;
        return cleared | setBitMask;
    }
}
