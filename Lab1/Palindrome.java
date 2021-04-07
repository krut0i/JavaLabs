package palindrome;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("java"));
        System.out.println(isPalindrome("Palindrome"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("apple"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("song"));
        System.out.println(isPalindrome("noon"));
    }
    
    public static String reverseString(String str) {
        String resultString = "";
        for (int i = 0; i < str.length(); i++) {
            resultString = str.charAt(i) + resultString;
        }
        return resultString;
    }
    
    public static boolean isPalindrome(String s) {
        String resultString = "";
        for (int i = 0; i < s.length(); i++) {
            resultString = s.charAt(i) + resultString;
        }
        if (resultString.equals(s)) {
            return true;
        }
        return false;
    }
}
