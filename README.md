# Build Flow JSON Parser Extension

This plugin provides DSL extensions to the BuildFlow plugin to allow building and parsing JSON objects.

Usage in a Build Flow DSL:

```groovy
def parser = extension."build-flow-json-parser-extension"
def lunch = parser.parseTest("{\"food\": [{\"name": \"pb and j\", \"ingredients\": [\"bread\", \"peanut butter\", \"jelly\"]}]}")
out.println(lunch.food.name) //=> pb and j
```