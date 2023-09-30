package com.hemebiotech.analytics.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SymptomReader implements ISymptomReader {

	private final String filepath;

	public SymptomReader(String filepath) {
		this.filepath = filepath;
	}

	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
	}

}
