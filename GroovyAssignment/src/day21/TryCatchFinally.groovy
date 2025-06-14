package day21

try {
    def a = 10
    def b = 0
    println "Result: ${a / b}" 
} catch (ArithmeticException e) {
    println "Error: Cannot divide by zero"
} finally {
    println "Finished error handling block"
}
