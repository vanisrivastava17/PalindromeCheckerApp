import java.util.Scanner;

public class PalindromeCheckerApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String copy = s;
        String reverse = "";
        for (int i = copy.length() - 1; i >= 0; i--) {
            reverse += copy.charAt(i);
        }
        if (copy.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }   
    }
}