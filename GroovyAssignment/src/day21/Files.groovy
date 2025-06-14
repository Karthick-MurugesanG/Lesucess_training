package day21

def file = new File("name.txt")
file.text = "Karthick Murugesan"

def content = file.text
println "Read from file: $content"
