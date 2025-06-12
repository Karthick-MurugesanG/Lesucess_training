package day19

def str = "Groovy Programming"
def vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
def count = 0

for (ch in str) {
    if (ch in vowels) {
        count++
    }
}

println "Number of vowels: $count"
