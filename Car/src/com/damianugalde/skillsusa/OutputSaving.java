package com.damianugalde.skillsusa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * 
 * Output utility class, that allows to write to files.
 * 
 * @author Damian Ugalde
 * @date 2016-04-02
 *
 */
public class OutputSaving {
	
	/**
	 * Given an int, it will write an output file called "out.txt" to the root folder of this project.
	 * @param num the number to be saved.
	 */
	public static void writeToFile(String str){
		try{
			FileWriter fw = new FileWriter("out.txt");
			BufferedWriter bf = new BufferedWriter(fw);
			
			while(str.indexOf("\n") >= 0){
				bf.write(str.substring(0, str.indexOf("\n")));
				str = str.substring(str.indexOf("\n") + 1);
				bf.newLine();
			}
			bf.write(str);
			bf.close();
			fw.close();
		}catch(Exception e){
			System.out.println("Something went wrong when trying to save to file.");
		}
	}
	
}
