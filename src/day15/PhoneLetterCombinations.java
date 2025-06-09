package day15;

import java.util.*;

public class PhoneLetterCombinations {
    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits (2-9 only): ");
        String digits = sc.nextLine();

        List<String> combinations = new PhoneLetterCombinations().letterCombinations(digits);
        if (combinations.isEmpty()) {
            System.out.println("No combinations.");
        } else {
            System.out.println("Combinations:");
            for (String s : combinations)
                System.out.print(s + " ");
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int index, String digits, StringBuilder path, List<String> result) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            path.append(ch);
            backtrack(index + 1, digits, path, result);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
