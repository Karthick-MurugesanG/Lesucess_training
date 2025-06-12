package day19

def reverseString(String str) {
	def result = ''
	for (int i = str.length() - 1; i >= 0; i--) {
	result += str[i]
	}
	return result
   }
   println reverseString("KnowKode")