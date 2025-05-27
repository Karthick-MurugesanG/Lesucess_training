package day1;

import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("AND: " + (x & y));
        System.out.println("OR: " + (x | y));
        System.out.println("XOR: " + (x ^ y));
        System.out.println("Left shift x by 2: " + (x << 2));
        System.out.println("Left shift y by 2: " + (y << 2));
        System.out.println("Right shift x by 2: " + (x >> 2));
        System.out.println("Right shift y by 2: " + (y >> 2));
    }
}
