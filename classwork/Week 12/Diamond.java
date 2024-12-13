public class Diamond {
    public static void main(String args[]) {
        print(7);
    }

    public static void print(int n) {
        for(int i = 1; i <= (n * 2); i++) {
            for(int j = 1; j < (n * 2); j++) {
                if(i <= n) {
                    int empty = n - i;
                    if(j <= empty || j >= (n * 2) - empty) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    int empty = i - n - 1;
                    if(j <= empty || j >= (n * 2) - empty) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}