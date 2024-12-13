public class FloydTriangle {
    public static void main(String args[]) {
        print(13);
    }   
    
    public static void print(int n) {
        int counter = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}