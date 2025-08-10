public class PalindromeNo {
    public static void main(String[] args) {
        int num = 121, reversed = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(original == reversed ? "Palindrome" : "Not Palindrome");
    }
}