public class CheckSort {
    public static boolean check(int[] n, int i) {
        if(i == n.length - 1) {
            return true;
        }
        if(n[i] > n[i + 1]) {
            return false;
        }
        return check(n, i + 1);
    }
    public static void main(String args[]) {
        int n[] = {1, 2, 3, 4, 5, 6};
        System.out.println(check(n, 0));
    } 
}