# StringFormatter

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
