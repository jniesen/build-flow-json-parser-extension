# Build Flow JSON Parser Extension

This plugin provides DSL extensions to the BuildFlow plugin to allow building and parsing JSON objects.

Usage in a Build Flow DSL:

```groovy
def parser = extension."build-flow-json-parser-extension"
def lunch = parser.parseText("{\"food\": [{\"name\": \"pb and j\", \"ingredients\": [\"bread\", \"peanut butter\", \"jelly\"]}]}")
out.println(lunch.food.name) //=> [pb and j]
```

## Installation

1. Download the ``*.hpi`` for the version you want in the Releases tab of this repo.
2. Navigate to the Advanced tab of your Jenkins Master's plugin manager.
3. Upload the ``*.hpi`` you downloaded in step 1.
