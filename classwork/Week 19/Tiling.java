public class Tiling {

    public static int calc(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return calc(n - 1) + calc(n - 2);
    }
    public static void main(String args[]) {
        int n = 8;
        System.out.println(calc(n));
    }    
}