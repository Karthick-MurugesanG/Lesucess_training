package day13;

import java.util.*;

public class StockSpan {
   public static int[] calculateSpan(int[] prices) {
       int n = prices.length;
       int[] span = new int[n];
       Stack<Integer> stack = new Stack<>();

       for (int i = 0; i < n; i++) {
           while (!stack.isEmpty() && prices[stack.peek()] <= prices[i])
               stack.pop();

           span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
           stack.push(i);
       }

       return span;
   }
   public static void main(String []arrgs) {
	   Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of days: ");
       int n = sc.nextInt();
       int[] prices = new int[n];
       System.out.println("Enter prices:");
       for (int i = 0; i < n; i++)
           prices[i] = sc.nextInt();
       int[] span = StockSpan.calculateSpan(prices);
       System.out.print("Span: ");
       for (int sp : span) System.out.print(sp + " ");
       System.out.println();
   }
}