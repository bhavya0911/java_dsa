public class LastOccurance {

    public static int find(int[] n, int i, int key) {
        if(i == n.length) {
            return -1;
        }
        int isFound = find(n, i + 1, key);
        if(isFound == -1 && n[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String args[]) {
        int[] n = {8, 3, 6, 9, 5, 10, 2, 5, 3, 5};
        int key = 5;
        System.out.println(find(n, 0, key));
    }    
}