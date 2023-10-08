package com.hemebiotech.analytics.counter;

public interface ISymptomCounter {
    /**
     * If no data is available, return an empty Map
     * Create a TreeMap from the syndromes list with all symptoms counted and sorted by alphabetic order
     */
    void count();
}