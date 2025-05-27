package day1;

import java.util.Scanner;
public class ArithmeticExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter a double value: ");
        Double d = sc.nextDouble();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((b != 0) ? (a / b) : "Cannot divide by zero"));
        double result = (a + b) * d;
        System.out.println("Multiplication of sum with double: " + result);
    }
}
