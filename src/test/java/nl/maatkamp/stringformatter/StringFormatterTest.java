package nl.maatkamp.stringformatter;

import org.junit.Assert;
import org.junit.Test;

public class StringFormatterTest {
    @Test
    public void testFormating() {
        Assert.assertEquals(
            "20 spam 10 bar 20",
            StringFormatter.of("{1} {ham} {0} {foo} {1}")
                    .arg(10)        // {0}
                    .arg(20)        // {1}
                    .arg("foo", "bar")
                    .arg("ham", "spam")
                    .format());
    }
}