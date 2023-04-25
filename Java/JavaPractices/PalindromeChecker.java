package Java.JavaPractices;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

    //palindrome checker method
    static boolean isPalindrome(int num){
        if (num == reverseNum(num)) {
            return true;
        } else {
            return false;
        }
    }

    //number reverser method
    static int reverseNum(int num) {
        int reversedNum = 0;

        while(num != 0){
            reversedNum *= 10; //add space to reversed num exp: before this statemt abc after this abc0
            reversedNum += (num % 10);//adding num's last digit to reversedNum exp: abc0 + d = abcd
            num/=10;//deleting last digit
        }
        return reversedNum;
    }
}
