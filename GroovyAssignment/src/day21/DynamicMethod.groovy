package day21

class DynamicMethodHandler {
    def methodMissing(String name, args) {
        println "Method '$name' is not defined"
    }
}

def obj = new DynamicMethodHandler()
obj.unknownMethod()