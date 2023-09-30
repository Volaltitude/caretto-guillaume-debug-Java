package com.hemebiotech.analytics.writer;

import java.util.HashMap;
import java.util.TreeMap;

public interface ISymptomWriter {

     void write(TreeMap<String, Long> symptomsMap);
}