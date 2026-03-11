public class PalindromeCheckerApp {

    public static void main(String[] args){
        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length as per the hint
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character at index i with character at the symmetric position from the end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // No need to check further if a mismatch is found
            }
        }

        // Print the result as shown in the expected output
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }

}
