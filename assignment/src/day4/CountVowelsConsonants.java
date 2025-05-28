package day4;
import java.util.Scanner;
public class CountVowelsConsonants {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
