package day13;
import java.util.*;

public class RemoveAdjacentDuplicates {
   public static String removeDuplicates(String s) {
       Stack<Character> stack = new Stack<>();
       for (char ch : s.toCharArray()) {
           if (!stack.isEmpty() && stack.peek() == ch)
               stack.pop();
           else
               stack.push(ch);
       }

       StringBuilder result = new StringBuilder();
       for (char ch : stack)
           result.append(ch);
       return result.toString();
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter string: ");
       String input = sc.nextLine();
       System.out.println("Output: " + RemoveAdjacentDuplicates.removeDuplicates(input));
   }
}
