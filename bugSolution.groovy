```groovy
def myMethod(Map params) {
  // Safely access a map parameter, handling the case when the key is absent
  def value = params.containsKey("missingKey") ? params.get("missingKey") : "DefaultValue"
  println value
}

myMethod(["presentKey": 1]) //Prints DefaultValue
myMethod(["presentKey": 1, "missingKey": 2]) //Prints 2
```