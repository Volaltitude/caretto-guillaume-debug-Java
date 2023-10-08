package com.hemebiotech.analytics;

import com.hemebiotech.analytics.counter.SymptomCounter;
import com.hemebiotech.analytics.reader.SymptomReader;
import com.hemebiotech.analytics.writer.SymptomWriter;

/**
 * Build an object with all the methods needed to read, count, and write
 */
public class Builder {

    private final SymptomReader reader;
    private final SymptomCounter counter;
    private final SymptomWriter writer;

    /**
     *
     * @param from the path to the file to read
     * @param to the path to the file to write
     */
    public Builder(String from, String to) {
        this.reader = new SymptomReader(from);
        this.counter = new SymptomCounter();
        this.writer = new SymptomWriter(to);
    }

    /**
     * Read symptoms from file, count them, order them in alphabetic number, and write them in a new file
     *
     */
    public void buildSymptomsResult() {
        this.counter.setSymptoms(this.reader.getSymptoms());
        this.counter.count();
        this.writer.write(this.counter.getSortedSymptoms());
    }

}