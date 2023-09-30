package com.hemebiotech.analytics.counter;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SymptomCounter implements ISymptomCounter{

    private List<String> symptoms;
    private final TreeMap<String, Long> sortedSymptoms;

    public SymptomCounter() {
        this.symptoms = new ArrayList<>();
        this.sortedSymptoms = new TreeMap<>();
    }

    @Override
    public void count() {
        this.sortedSymptoms.clear();
        this.sortedSymptoms.putAll(this.symptoms.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));
    }

    public TreeMap<String, Long> getSortedSymptoms() {
        return this.sortedSymptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }
}