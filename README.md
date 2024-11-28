# StringFormatter

# install

Add dependeny in pom.xml:

```xml
<dependency>
  <groupId>nl.marcelmaatkamp</groupId>
  <artifactId>stringformatter</artifactId>
  <version>${{  github.ref_name }}</version>
</dependency>
```

## usage

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
