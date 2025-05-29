package day5;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPali(String s, int st, int end) {
        if (st >= end) 
            return true;
        if (s.charAt(st) != s.charAt(end))
            return false;
        return isPali(s, st + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        if (isPali(ip, 0, ip.length() - 1))
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");
    }
}
