package day9;

import java.util.*;

public class RepeatedStringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        long fullRepeats = n / s.length();
        long remainder = n % s.length();
        long countInOne = 0;
        long countInRemainder = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') countInOne++;
        }
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') countInRemainder++;
        }
        long totalCount = fullRepeats * countInOne + countInRemainder;
        System.out.println(totalCount);
    }
}
