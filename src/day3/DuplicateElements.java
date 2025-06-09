package day3;

import java.util.*;
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
        int[] arr = new int[n];
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
                for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(seen.contains(arr[i]))
                duplicates.add(arr[i]);
            else
                seen.add(arr[i]);
        }
        if(duplicates.isEmpty())
            System.out.println("No duplicates");
        else {
            for(int num : duplicates)
                System.out.print(num + " ");
        }
        sc.close();
    }
}
