package org.example;

class Main {
    void main(String[] args) throws Exception {
        VirtualThreads.execute();
        UnnamedPatterns.execute();
        SequencedCollections.execute();
        RecordPatterns.execute();
        ScopedValues.execute();
    }
}