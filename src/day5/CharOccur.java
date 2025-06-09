package day5;

import java.util.Scanner;

public class CharOccur {
	static int charoccr(String s,char c,int i,int co) {
		if(i<s.length())
		if(s.charAt(i)==c) {
			co++;
			return charoccr(s,c,i+1,co);
		}
		else
			return charoccr(s,c,i+1,co);
		return co;
	}
	public static void main(String[] a) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		System.out.println(charoccr(s,c,0,0));
	}
}
