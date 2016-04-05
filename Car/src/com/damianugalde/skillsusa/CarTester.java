package com.damianugalde.skillsusa;

import javax.swing.JOptionPane;

/**
 * This class is used to test the {@code Car} class. It allows the user to
 * interact with the car.
 * 
 * @author Damian Ugalde
 * @date 2016-04-02
 *
 */
public class CarTester {

	public static void main(String[] args) {

		int numOfWheels = 0;
		int numOfDoors = 0;
		try {
			numOfWheels = Integer.parseInt(JOptionPane.showInputDialog("How many wheels?"));
			if (numOfWheels <= 0) {
				JOptionPane.showMessageDialog(null, "Default value of 4 tires set.");
				numOfWheels = 4;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Default value of 4 wheels set.");
			numOfWheels = 4;
		}

		try {
			numOfDoors = Integer.parseInt(JOptionPane.showInputDialog("How many doors?"));
			if (numOfDoors <= 0) {
				JOptionPane.showMessageDialog(null, "Default value of 4 doors set.");
				numOfDoors = 4;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Default value of 4 doors set.");
			numOfDoors = 4;
		}

		Car car = new Car(numOfWheels, numOfDoors);

		JOptionPane.showMessageDialog(null,
				"A new car has ben created with " + numOfWheels + " wheels, and " + numOfDoors + " doors.");

		String[] choices = { "Move the wheels", "Start the engine", "Open the doors", "Stop the car", "Close the doors", "Close" };

		int index = 0;
		StringBuilder toFile = new StringBuilder();

		do {

			index = JOptionPane.showOptionDialog(null, "", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
					choices, null);
			String output = "";
			switch(index){
			case 0:
				output = car.move();
				break;
			case 1:
				output = car.startCar();
				break;
			case 2:
				output = car.openDoors();
				break;
			case 3:
				output = car.stopCar();
				break;
			case 4:
				output = car.closeDoors();
				break;
			case 5:
				OutputSaving.writeToFile(toFile.toString());
				System.exit(0);
				break;
			};
			JOptionPane.showMessageDialog(null, output);
			toFile.append(output + "\n");

		} while (index < 6 && index >= 0);

	}

}