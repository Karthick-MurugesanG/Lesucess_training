package day20

def calculate(a, b, operation) {
 return operation(a, b)
}
def add = { x, y -> x + y }
def subtract = { x, y -> x - y }
def multiply = { x, y -> x * y }
println "Add: " + calculate(10, 5, add)
println "Subtract: " + calculate(10, 5, subtract)
println "Multiply: " + calculate(10, 5, multiply)