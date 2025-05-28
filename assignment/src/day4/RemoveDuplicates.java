package day4;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1)
                result.append(c);
        }
        System.out.println(result.toString());
    }
}
