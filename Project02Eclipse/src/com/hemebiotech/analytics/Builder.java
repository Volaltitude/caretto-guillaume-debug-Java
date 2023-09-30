package com.hemebiotech.analytics;

import com.hemebiotech.analytics.counter.SymptomCounter;
import com.hemebiotech.analytics.reader.SymptomReader;
import com.hemebiotech.analytics.writer.SymptomWriter;

public class Analytics {

    private final SymptomReader reader;
    private final SymptomCounter counter;
    private final SymptomWriter writer;

    public Analytics(String from, String to) {
        this.reader = new SymptomReader(from);
        this.counter = new SymptomCounter();
        this.writer = new SymptomWriter(to);
    }


    public void generateSymptomsResult() {
        this.reader.getSymptoms();
        this.counter.setSymptoms(this.reader.getSymptoms());
        this.counter.count();
        this.writer.write(this.counter.getSortedSymptoms());
    }

}