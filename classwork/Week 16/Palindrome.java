public class Palindrome {
    public static void main(String args[]) {
        String test = "racecar";
        System.out.println(checkForPalindrome(test));
        String test1 = "bhavya";
        System.out.println(checkForPalindrome(test1));
    }

    public static boolean checkForPalindrome(String str) {
        int n = str.length();
        for(int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
         }
        return true;
    }
}