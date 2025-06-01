package day9;

import java.util.*;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 0, 6, 0, 0};
        int n = arr.length;
        int index = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
