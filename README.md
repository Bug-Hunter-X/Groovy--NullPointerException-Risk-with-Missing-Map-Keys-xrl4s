# Groovy NullPointerException Risk with Missing Map Keys

This repository demonstrates a common Groovy error related to null pointer exceptions arising from accessing non-existent keys in maps.

The `bug.groovy` file showcases the problem: attempting to access a key in a map without checking for its presence can lead to unexpected null values propagating through the code.  This can cause subtle errors if further operations expect a non-null value.

The solution in `bugSolution.groovy` uses the `containsKey` method for robust handling of missing keys.