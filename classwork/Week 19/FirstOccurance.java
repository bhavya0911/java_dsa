public class FirstOccurance {

    public static int find(int[] n, int i, int key) {
        if(i == n.length - 1) {
            return -1;
        }
        if(n[i] == key) {
            return i;
        }
        return find(n, i + 1, key);
    }
    public static void main(String args[]) {
        int[] n = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        System.out.println(find(n, 0, key));
    }    
}