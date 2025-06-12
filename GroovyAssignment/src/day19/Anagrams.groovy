package day19

def Anagrams(String str1, String str2) {
 return str1.toList().sort() == str2.toList().sort()
}
println Anagrams("listen", "silent") 