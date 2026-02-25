import java.util.Scanner;

public class PalindromeCheckerApp{
 public static void main(String[] args) {
        // Hardcoded string
        String str = "madam";
        
        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Check if palindrome
        if (str.equals(reversed)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}
        }   
    }
}