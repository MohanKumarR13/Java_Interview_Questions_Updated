package com.write_data_into_text_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter(".\\WriteData.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		bufferedWriter.write("Java ");
		bufferedWriter.write("Python ");
		bufferedWriter.write("C#");

		System.out.println("Finished");
		bufferedWriter.close();

	}

}
