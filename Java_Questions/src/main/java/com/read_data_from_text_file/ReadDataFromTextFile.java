package com.read_data_from_text_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
	public static void usingBufferReader() throws IOException {
		FileReader fileReader = new FileReader(".\\Welcome To Java.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str;
		while ((str = bufferedReader.readLine()) != null) {
			System.out.println(str);
		}
		bufferedReader.close();
	}

	public static void usingFileAndScanner() throws FileNotFoundException {
		File file = new File(".\\Welcome To Java.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		// Loop Statement
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}

	}

	public static void useDelimiter() throws FileNotFoundException {
		File file = new File(".\\Welcome To Java.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter("\\Z");
		System.out.println(scanner.next());

	}

	public static void main(String[] args) throws IOException {
		usingBufferReader();
		usingFileAndScanner();
		useDelimiter();
	}

}
