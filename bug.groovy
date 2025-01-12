```groovy
def myMethod(Map params) {
  // Accessing a map parameter that might not exist
  def value = params.get("missingKey")
  println value
}

myMethod(["presentKey": 1]) //missingKey is not present, will print null
```