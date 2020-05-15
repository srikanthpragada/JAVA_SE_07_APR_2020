package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class WordFreq {

	public static void main(String[] args) throws IOException {

		Path p = Path.of("c:\\classroom\\apr7\\lion.txt");
		TreeMap<String, Integer> wordFreq = new TreeMap<>();
		int count;

		for (String line : Files.readAllLines(p)) {
			String words[] = line.split(" ");
			for (String word : words) {
				if (wordFreq.containsKey(word)) {
					count = wordFreq.get(word);
					count++;
				} else {
					count = 1;
				}
				wordFreq.put(word, count);
			}
		}

		for (String word : wordFreq.keySet()) {
			System.out.printf("%-10s  %d\n", word, wordFreq.get(word));
		}

	}  // main
}