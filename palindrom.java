//Problem: Check if a string is palindrome or not using recursion.
//approach: A string is a palindrome if it reads the same backward as forward. To check if a string is a palindrome using recursion, we can compare the first and last characters of the string. If they are the same, we can then check the substring that excludes these two characters. We continue this process until we have checked all characters or found a mismatch.
//Time Complexity: O(n) where n is the length of the string, as we may need to check each character at most once.
//Space Complexity: O(n) due to the maximum depth of the recursion stack being n/

public class palindrom {
    public static boolean isPalindrome(String str,int i,int n){
        if(i>=n/2) return true;
        if(str.charAt(i)!=str.charAt(n-1))
            return false;
        return isPalindrome(str, i+1, n-1);
    }

    public static void main(String[] args) {
        String str="madrm";
        int n=str.length();
        System.out.println(isPalindrome(str, 0, n));
    }    
}

