package com.damianugalde.skillsusa;

/**
 * 
 * Implements a Wheel object, that can be used in any kind of vehicle implementation.
 * 
 * @author Damian Ugalde
 * @date 2016-04-02
 */
public class Wheel {
	
	private boolean isRunning;
	private final int ID;
	
	/**
	 *  Creates a new wheel object.
	 * @param ID an ID number assigned, in case that the car uses more than one wheel.
	 * @param isRunning An initial value if the wheels should start moving.
	 */
	public Wheel(int ID, boolean isRunning){
		this.ID = ID;
		this.isRunning = isRunning;
	}
	
	/**
	 * Simulate a wheel turning.
	 * @return A message appropriate for the state of the wheels.
	 */
	public String start(){
		isRunning = true;
		return printStatus();
	}
	
	/**
	 * Stops the wheel from turning.
	 * @return A message appropriate for the state of the wheels.
	 */
	public String stop(){
		isRunning = false;
		return printStatus();
	}
	
	/**
	 * If this wheel is turning, it will make it stop. On the other hand, if the wheel is not turning,
	 * it will begin to move.
	 * @return A message appropriate for the state of the wheels.
	 */
	public String toggleRunning(){
		isRunning = !isRunning;
		return printStatus();
	}
	
	/**
	 *  Checks if the wheel is moving or not.
	 * @return true if the wheel is in motion. False otherwise.
	 */
	public boolean isRunning(){
		return isRunning;
	}
	
	/**
	 * Will check the status of the wheel, and create an appropriate message based on the wheel's movement.
	 * @return A message appropriate for the state of the wheels.
	 */
	public String printStatus(){
		if(isRunning) return ("Wheel " + ID + " is moving");
		else return ("Wheel " + ID + " has stopped");
	}
	
}