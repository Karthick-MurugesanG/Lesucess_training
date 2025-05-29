package day5;
import java.util.Scanner;
public class Power {
	static int pow(int n,int m) {
		if(m>0)
			return n*pow(n,m-1);
		else
			return 1;
	}
	public static void main(String []a) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(pow(n,m));
	}
}
