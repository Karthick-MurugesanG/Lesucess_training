package day3;

import java.util.Scanner;
public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        k = k % n;  // In case k > n
        // Left rotate
        for(int i = k; i < n; i++)
            System.out.print(arr[i] + " ");
        for(int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
}


