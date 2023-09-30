package com.hemebiotech.analytics;

public class Main {

	private static Builder builder;

	public static void main(String[] args) {
		builder = new Builder("symptoms.txt", "result.out");
		builder.buildSymptomsResult();
	}
}
