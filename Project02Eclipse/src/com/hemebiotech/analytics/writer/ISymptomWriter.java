package com.hemebiotech.analytics.writer;

import java.util.HashMap;
import java.util.TreeMap;

public interface ISymptomWriter {

     /**
      * Write a "result.out" file with the sorted and counted symptoms
      *
      * @param symptomsMap  a sorted and counted TreeMap of symptoms
      */
     void write(TreeMap<String, Long> symptomsMap);
}