package org.example;

import java.util.LinkedList;
import java.util.SequencedCollection;

public class SequencedCollections {
    public static void execute() {
        SequencedCollection<String> sequencedCollection = new LinkedList();
        sequencedCollection.addFirst("test1");
        sequencedCollection.addLast("test0");
        sequencedCollection.addFirst("test2");

        System.out.println(STR."seq : \{ sequencedCollection }");
    }
}
