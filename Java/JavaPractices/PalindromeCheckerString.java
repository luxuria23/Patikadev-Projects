package Java.JavaPractices;

public class PalindromeCheckerString {
    public static void main(String[] args) {
        System.out.println(IsPalindrome("kavak"));
    }

    static boolean IsPalindrome(String str){
        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
