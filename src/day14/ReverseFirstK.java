package day14;

import java.util.*;

public class ReverseFirstK {
    public static Queue<Integer> reverseKElements(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k > queue.size()) return queue;

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++)
            stack.push(queue.remove());

        // Step 2: Enqueue back stack elements
        while (!stack.isEmpty())
            queue.add(stack.pop());

        // Step 3: Move the remaining elements to the back
        int size = queue.size();
        for (int i = 0; i < size - k; i++)
            queue.add(queue.remove());

        return queue;
    }
    public static void main(String[] args) {
    	 // Test 3: Reverse First K Elements
        System.out.println("\nReverse First K Elements:");
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 3;
        Queue<Integer> result = ReverseFirstK.reverseKElements(queue, k);
        for (int val : result)
            System.out.print(val + " "); // Output: 3 2 1 4 5
        System.out.println();
    }
}