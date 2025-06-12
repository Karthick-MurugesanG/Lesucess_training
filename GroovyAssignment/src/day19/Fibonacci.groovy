package day19

def printFibonacci(int n) {
 def a = 0, b = 1
 print "$a $b "
 for (int i = 2; i < n; i++) {
 def next = a + b
 print "$next "
 a = b
 b = next
 }
}
printFibonacci(10)