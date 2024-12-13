public class InvertedWithNum {
    public static void main(String args[]) {
        print(15);
    }   
    
    public static void print(int n) {
        for(int i = 0; i < n; i++) {
            int fill = n - i;
            for(int j = 1; j <= n; j++) {
                if(j <= fill) {
                    System.out.print(j + " ");
                } else {
                    break;
                }      
            }
            System.out.println();
        }
    }
}