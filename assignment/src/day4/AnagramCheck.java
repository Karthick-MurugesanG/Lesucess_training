package day4;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagrams" : "Not Anagrams");
    }
}
