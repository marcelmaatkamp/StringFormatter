package nl.maatkamp.stringformatter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Marcel Maatkamp (m.maatkamp@gmail.com)
 */
public class StringFormatter {
    private final String template;
    private final Map<String, String> namedArgs = new HashMap<>();
    private final List<String> positionalArgs = new ArrayList<>();

    private StringFormatter(String template) {
        this.template = template;
    }

    public static StringFormatter of(String template) {
        return new StringFormatter(template);
    }

    public StringFormatter arg(Object value) {
        positionalArgs.add(String.valueOf(value));
        return this;
    }

    public StringFormatter arg(String name, Object value) {
        namedArgs.put(name, String.valueOf(value));
        return this;
    }

    public String format() {
        String result = template;

        // Replace positional arguments
        for (int i = 0; i < positionalArgs.size(); i++) {
            result = result.replace("{" + i + "}", positionalArgs.get(i));
        }

        // Replace named arguments
        for (Map.Entry<String, String> entry : namedArgs.entrySet()) {
            result = result.replace("{" + entry.getKey() + "}", entry.getValue());
        }

        return result;
    }
}