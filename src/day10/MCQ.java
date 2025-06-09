package day10;

public class MCQ {
    public static void main(String[] args) {
        String[][] questions = {
            {"1. What is the time complexity of binary search in a sorted array?", "A) O(log n)"},
            {"2. What is the average-case time complexity of quicksort?", "A) O(n log n)"},
            {"3. Time complexity of nested loops iterating n times?", "C) O(n^2)"},
            {"4. Space complexity of merge sort?", "B) O(n)"},
            {"5. Time complexity of a loop doubling i each iteration?", "A) O(log n)"},
            {"6. Space complexity of iterative binary search?", "A) O(1)"},
            {"7. Time complexity of inserting at the start of a LinkedList?", "A) O(1)"},
            {"8. Time complexity of accessing an element in an array?", "A) O(1)"},
            {"9. Worst-case time complexity of bubble sort?", "C) O(n^2)"},
            {"10. Time complexity of a loop incrementing a variable n times?", "A) O(n)"},
            {"11. Time complexity of reversing a LinkedList iteratively?", "A) O(n)"},
            {"12. Space complexity of a recursive function adding stack frames?", "A) O(n)"},
            {"13. Average-case time complexity of inserting into a HashMap?", "B) O(1)"},
            {"14. Time complexity of nested loops running n and sqrt(n) times?", "D) O(n*sqrt(n))"},
            {"15. Space complexity of an array of size n?", "A) O(n)"},
            {"16. Sorting algorithm with lowest average-case complexity?", "C) Merge Sort"},
            {"17. Time complexity of standard n x n matrix multiplication?", "B) O(n^3)"},
            {"18. Best-case time complexity of Insertion Sort?", "C) O(n)"},
            {"19. Time complexity of a nested loop iterating n times each?", "D) O(n^2)"},
            {"20. Worst-case time complexity of searching in a hash table?", "C) O(n)"}
        };

        System.out.println("===== MCQ Answers =====\n");
        for (String[] q : questions) {
            System.out.printf("%s\nCorrect Answer: %s\n\n", q[0], q[1]);
        }
    }
}
