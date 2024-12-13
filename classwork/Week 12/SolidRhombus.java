public class SolidRhombus {
    public static void main(String args[]) {
        print(5);
    }

    public static void print(int n) {
        for(int i = 1; i < n; i++) {
            int empty = n - i;
            for(int j = 1; j <= (n + empty); j++) {
                if(j <= empty) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}