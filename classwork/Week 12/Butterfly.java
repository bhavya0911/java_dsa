public class Butterfly {
    public static void main(String args[]) {
        print(4);
    }
    public static void print(int n) {
        for(int i = 1; i <= (n * 2); i++) {
            for(int j = 1; j <= (n * 2); j++) {
                if(i <= n) {
                    if(j <= i || ((n * 2) - j) < i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    int empty = i - n - 1;
                    if(j <= (n - empty) || j > (n + empty)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
