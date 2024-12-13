public class LargestOfThree {
    public static void main(String args[]) {
        int a = 5, b = 6, c = 10;
        if(a > b && a > c) {
            System.out.println("A is largest");
        } else if(b > c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
    }
}
