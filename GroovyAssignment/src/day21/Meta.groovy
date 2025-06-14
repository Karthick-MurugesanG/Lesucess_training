package day21

class MetaDemo {}

def obj = new MetaDemo()
obj.metaClass.dynamicProp = "Set at runtime"
println obj.dynamicProp