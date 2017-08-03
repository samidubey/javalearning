package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {

		// readingFile("C:/Users/deesam/Documents/test.txt");
		readingFilesOptimized("C:/Users/deesam/Documents/test.txt");
	}

	public static void readingFilesOptimized(String file) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(new File(file)));

		String line = "";

		Map<String, Integer> wordCount = new HashMap<>();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();

			if (line != null) {
				String[] words = line.split(" ");

				for (String word : words) {

					if (wordCount.containsKey(word)) {
						wordCount.put(word, wordCount.get(word) + 1);
					} else {
						wordCount.put(word, 1);
					}
				}
			}

		}

		System.out.println(wordCount);

		br.close();
	}

	public static void readingFile(String file) {

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";
			List<String> words = new ArrayList<>();
			while (line != null) {
				line = br.readLine();
				if (line != null && !line.isEmpty()) {
					String[] word = line.split(" ");
					for (String s : word) {
						words.add(s);
					}
				}
			}

			Set<String> uniqueWords = new HashSet<String>(words);
			System.out.format("%s%19s", "Word", "Count");
			for (String word : uniqueWords) {
				System.out.println();
				System.out.format("%s%15d", word, Collections.frequency(words, word));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
