package org.example;

public class UnnamedPatterns {
    public static void execute() {
        final var numbString = "te2234";
        try {
            final int number = Integer.parseInt(numbString);
        } catch (NumberFormatException exception) {
            System.out.println(STR."Invalid number: \{ numbString }");
        }
    }
}
