package day13;

import java.util.*;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter expression: ");
         String expr = sc.nextLine();
         boolean result = BalancedParentheses.isBalanced(expr);
         System.out.println("Output: " + (result ? "Balanced" : "Not Balanced"));
    }
}