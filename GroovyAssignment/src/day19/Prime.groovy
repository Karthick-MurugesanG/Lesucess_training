package day19

def num=17
int n=0;
 if (num < 2) print false
 for (int i = 2; i <= Math.sqrt(num); i++) {
 if (num % i == 0) {
	 n++
	 break}
}
if (n==0)
	print true;
else
	print false