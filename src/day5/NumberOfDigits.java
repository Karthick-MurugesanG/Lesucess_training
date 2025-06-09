package day5;

import java.util.Scanner;

public class NumberOfDigits {
static int Digit(int n) {

	if(n>0)
		return 1+Digit(n/10);
	else
		return 0;
}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(Digit(n));
}
}
