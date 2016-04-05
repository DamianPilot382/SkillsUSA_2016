package com.damianugalde.skillsusa;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * 
 * This class is used to calculate a percentile from an array of numbers.
 * 
 * @author Damian Ugalde
 * @date 2016-04-02
 * @version 1.0
 *
 */
public class Percentile {

	/**
	 * Main point of execution of the program. Will ask the user for an input, using JOptionPanes to find the percentile of an array
	 * of integers given in a text file.
	 * @param args
	 */
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "You will need a file with integer values separated by comas.");
		String fileName = JOptionPane.showInputDialog("What is the name of the text file? (include a .txt extension at the end)");
		int[] arr = null;
		try{
			arr = InputOutputSaving.readFromFile(fileName);
			JOptionPane.showMessageDialog(null, "Array loaded.\n" + Arrays.toString(arr));
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,
					"File not loaded correctly. Please try again.");
			System.exit(0);
		}

		SearchAndSort.quickSort(arr);

		JOptionPane.showMessageDialog(null, "Array sorted.\n" + Arrays.toString(arr));

		int value = Integer.parseInt(JOptionPane.showInputDialog("Input a percentile."));
		int numFromPercentile = findNumFromPercentile(arr, value);
		JOptionPane.showMessageDialog(null, "Number found: " + numFromPercentile);
		InputOutputSaving.writeToFile(numFromPercentile);
		JOptionPane.showMessageDialog(null, "File writen as \"out.txt\"");
	}
	
	/**
	 * Find the number in an array, given a percentile.
	 * @param arr The array to be searched.
	 * @param p the percentile.
	 * @return value of the location in the array of the given percentile.
	 */
	public static int findNumFromPercentile(int[] arr, int p) {
		if(p < 0) p = 0;
		if(p > 100) p = 100;
		return arr[(int)Math.floor((p/100.0) * arr.length)];
	}

}