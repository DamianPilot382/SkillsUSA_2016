package com.damianugalde.skillsusa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * 
 * Input and Output utilities class, that allows to write to files.
 * 
 * @author Damian Ugalde
 * @date 2016-04-02
 *
 */
public class InputOutputSaving {
	
	/**
	 * Reads from a file located at the root of the project.
	 * @param fileName The name of the file to be opened.
	 * @return An array with the numbers found inside the text file.
	 * @throws FileNotFoundException The file was not found.
	 * @throws NumberFormatException The file contains illegal characters.
	 */
	public static int[] readFromFile(String fileName) throws FileNotFoundException, NumberFormatException {
		Scanner in = new Scanner(new File(fileName));
		StringBuilder strBuilder = new StringBuilder();
		while (in.hasNextLine()) {
			strBuilder.append(in.nextLine());
		}

		String[] rawFromFile = strBuilder.toString().replace(" ", "").split(",");
		int[] numsFromFile = new int[rawFromFile.length];
		for (int i = 0; i < numsFromFile.length; i++) {
			numsFromFile[i] = Integer.parseInt(rawFromFile[i]);
		}
		in.close();
		return numsFromFile;
	}
	
	
	/**
	 * Given an int, it will write an output file called "out.txt" to the root folder of this project.
	 * @param num the number to be saved.
	 */
	public static void writeToFile(int num){
		try{
			FileWriter fw = new FileWriter("out.txt");
			BufferedWriter bf = new BufferedWriter(fw);

			bf.write(num + "");
			bf.newLine();
			bf.close();
			fw.close();
		}catch(Exception e){
			System.out.println("Something went wrong when trying to save to file.");
		}
	}
	
}
