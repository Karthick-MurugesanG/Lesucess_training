package day6;

import java.util.Scanner;

public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s1=sc.nextLine();
    	String s2=sc.nextLine();
        System.out.println(isRotation(s1,s2)); 
                 
    }
}
