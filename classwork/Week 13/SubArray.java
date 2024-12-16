public class SubArray {
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }

    public static void printSubArrays(int numbers[]) {
        for(int i = 0; i < numbers.length; i ++) {
            for(int j = i; j < numbers.length; j++) {
                System.out.print("(");
                for(int n = i; n <= j; n++) {
                    System.out.print(numbers[n]);
                    if(n != j) {
                        System.out.print(", ");
                    }
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }
}