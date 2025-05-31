package day7;

class Calculator {
    int result;                         // instance variable
    static int operationCount = 0;      // static variable
    public void add(int a, int b) {
        result = a + b;
        operationCount++;
        System.out.println("Result: " + result);
    }
    public static void displayOperationCount() {
        System.out.println("Total operations: " + operationCount);
    }
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        c1.add(5, 3);  
        c2.add(10, 7); 
        Calculator.displayOperationCount(); 
    }
}
