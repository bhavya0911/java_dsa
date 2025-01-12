public class Subset {
    public static void findSubsets(String str, String ans, int i) {
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        findSubsets(str, ans+str.charAt(i), i + 1);
        findSubsets(str, ans, i + 1);
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0);
    }      
}