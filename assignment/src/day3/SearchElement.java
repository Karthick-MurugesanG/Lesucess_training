package day3;

import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        Boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                System.out.println(i);
                found = true;
                break;
            }
        }
                if(!found)
            System.out.println("Not found");
                sc.close();
    }
}
