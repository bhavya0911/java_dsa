public class Compare {
    public static void main(String args[]) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        compare(s1, s2);
        compare(s1, s3);
        compare(s2, s3);
        compareValue(s1, s2);
        compareValue(s1, s3);
        compareValue(s2, s3);
    }

    public static void compare(String s1, String s2) {
        if(s1 == s2) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }

    public static void compareValue(String s1, String s2) {
        if(s1.equals(s2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
