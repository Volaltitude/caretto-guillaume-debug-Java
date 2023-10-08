package com.hemebiotech.analytics.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * File writer line by line
 *
 */
public class SymptomWriter implements ISymptomWriter {

    private final String fileName;
    /**
     *
     * @param fileName Name to the file to write
     */
    public SymptomWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(TreeMap<String, Long> symptomsMap) {
        try {
            FileWriter writer = new FileWriter(this.fileName);
            for (String symptoms : symptomsMap.keySet()) {
                String toWrite = symptoms + ":" + symptomsMap.get(symptoms);
                System.out.println(toWrite);
                writer.write(toWrite + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}