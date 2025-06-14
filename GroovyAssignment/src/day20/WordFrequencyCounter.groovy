package day20

def sentence = "hello world hello"
def words = sentence.split(" ")
def wordCount = [:]
words.each { word ->
 wordCount[word] = wordCount.get(word, 0) + 1
}
wordCount.each { k, v -> println k + " -> " + v }
