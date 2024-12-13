public class CharacterPattern {
    public static void main(String args[]) {
        int n = 4;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                char c = 'A';
                System.out.print((char)(c + i + j));
            }
            System.out.println();
        }
    }    
}