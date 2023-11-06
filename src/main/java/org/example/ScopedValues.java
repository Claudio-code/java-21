package org.example;

public class ScopedValues {
    public static final ScopedValue<User> K8S_NAME = ScopedValue.newInstance();

    public static void execute() {
        final var user = User.newInstance();
        ScopedValue.where(K8S_NAME, user).run(() -> System.out.println("aq"));
    }

    static class User {

        public final long timestamp = System.currentTimeMillis();


        public static User newInstance() {
            return new User();
        }
    }
}
