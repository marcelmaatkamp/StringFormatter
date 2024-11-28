# StringFormatter

This java library substitutes named and postional arguments in a string like Python:

```python
txt = "My name is {fname}, I'm {age}".format(fname = "John", age = 36)
```

```java
var txt = nl.maatkamp.stringformatter.StringFormatter.of(
  "My name is {fname}, I'm {age}").arg("fname", "John").arg("age", "36").format();
``` 

# Install

Add dependeny in pom.xml:

```xml
<dependency>
  <groupId>nl.marcelmaatkamp</groupId>
  <artifactId>stringformatter</artifactId>
  <version>v1.0.0</version>
</dependency>
```

## Usage

```java
String result = nl.maatkamp.stringformatter.StringFormatter.of(
  "{1} {ham} {0} {foo} {1}")
    .arg(10)
    .arg(20)
    .arg("foo", "bar")
    .arg("ham", "spam")
      .format();
// Output: "20 spam 10 bar 20"
```
