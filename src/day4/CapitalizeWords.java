package day4;

import java.util.Scanner;
import java.util.Scanner;
public class CapitalizeWords {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
