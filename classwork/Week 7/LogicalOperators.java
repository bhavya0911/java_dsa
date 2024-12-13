public class LogicalOperators {
    public static void main(String args[]) {
        System.out.println((3 > 2) && (5 > 0));
        System.out.println((3 > 2) && (5 < 0));
        System.out.println((3 > 2) || (5 > 0));
        System.out.println((1 > 2) || (5 < 0));
        System.out.println(!(1 > 2) || (5 < 0));
    }
}
