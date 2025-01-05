public class FriendsPairing {

    public static int pairUp(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        return pairUp(n - 1) + (n - 1) * pairUp(n - 2);
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.println(pairUp(n));        
    }   
}