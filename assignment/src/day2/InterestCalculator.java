package day2;

import java.util.*;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose 1 for SI, 2 for CI: ");
        int choice = sc.nextInt();
        System.out.print("Enter Principal: ");
        Double P = sc.nextDouble();
        System.out.print("Enter Rate: ");
        Double R = sc.nextDouble();
        System.out.print("Enter Time: ");
        Double T = sc.nextDouble();
        if (choice == 1) {
            Double si = (P * R * T) / 100;
            System.out.println("Simple Interest: " + si);
        } else if (choice == 2) {
        	double ci = P * Math.pow((1 + R / 100), T) - P;
            System.out.println("Compound Interest: " + ci);
        } else {
            System.out.println("Invalid choice");
        } 
        }
    }
