package day1;

import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intVal = sc.nextInt();
        System.out.print("Enter a float: ");
        Float floatVal = sc.nextFloat();
        System.out.print("Enter a character: ");
        char charVal = sc.next().charAt(0);
        Float sum = (float) intVal + floatVal;
        int asciiSum = intVal + (int) charVal;
        System.out.println("Sum of integer converted to float and float: " + sum);
        System.out.println("Sum of integer and ASCII value of character: " + asciiSum);
    }
}

