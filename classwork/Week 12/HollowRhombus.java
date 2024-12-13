public class HollowRhombus {
    public static void main(String args[]) {
        print(15);
    }

    public static void print(int n) {
        for(int i = 1; i <= n; i++) {
            int empty = n - i;
            for(int j = 1; j <= (n + empty); j++) {
                    if((j > empty && i == 1) || i == n || j == (empty + 1) || j == (empty + n)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
}