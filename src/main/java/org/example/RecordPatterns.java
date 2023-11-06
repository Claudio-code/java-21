package org.example;

public class RecordPatterns {
    public static void execute() {
        final var claudio2 = new People("awww", 322);

        if (claudio2 instanceof People(String a, Integer b)) {
            System.out.println(STR."string value: \{ a } | integer value: \{ b }");
        }
    }

    record People(String name, Integer age) {}
}
