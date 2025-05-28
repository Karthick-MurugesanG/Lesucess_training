package day4;
import java.util.Scanner;
public class WordOccurrences {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        String wordToSearch = sc.nextLine();
        int count = 0;
        String[] words = sentence.split("\\W+");
        for (String word : words) {
            if (word.equals(wordToSearch)) count++;
        }
        System.out.println(count);
    }
}
