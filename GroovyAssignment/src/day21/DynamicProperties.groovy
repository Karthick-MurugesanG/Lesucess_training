package day21

class DynamicPropertyHandler {
    def propertyMissing(String name) {
        return "undefined"
    }
}

def obj = new DynamicPropertyHandler()
println obj.anyRandomThing 