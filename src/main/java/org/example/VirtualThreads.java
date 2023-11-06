package org.example;

import java.util.concurrent.Executors;

import static java.lang.StringTemplate.STR;

public class VirtualThreads {
    public static void execute() throws InterruptedException {
        Runnable runnable = () -> {
            final var milliseconds = System.currentTimeMillis();
            System.out.println(STR."test to day : \{ milliseconds }");
        };

        Thread.startVirtualThread(runnable);

        Thread virtualThread = Thread.ofVirtual().start(runnable);

        var executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(runnable);

        Thread.sleep(222);
    }
}
