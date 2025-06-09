package day4;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Palindrome" : "Not Palindrome");
    }
}
