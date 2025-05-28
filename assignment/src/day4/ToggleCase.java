package day4;
import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder toggled = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                toggled.append(Character.toLowerCase(c));
            else
                toggled.append(Character.toUpperCase(c));
        }
        System.out.println(toggled.toString());
    }
}
