package day19

int n=10 
 def a = 0, b = 1
 print "$a $b "
 for (int i = 2; i < n; i++) {
 def next = a + b
 print "$next "
 a = b
 b = next
 }
