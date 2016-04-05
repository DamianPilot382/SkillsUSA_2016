package com.damianugalde.skillsusa;

import java.util.ArrayList;
/**
 * 
 * @Author Damian Ugalde
 * @Version 1.0
 * @Date 2016-04-02
 * 
 * Implements a functional car object. It has wheels, doors, and an engine.
 * This class depends on the {@code Wheel}, {@code Engine}, and {@code Door} classes
 * found inside this same package.
 * 
 */
public class Car {
	
	private ArrayList<Wheel> wheels;
	private ArrayList<Door> doors;
	private Engine engine;
	
	/**
	 * Creates a car object with a specified number of wheels and doors.
	 * @param numberOfWheels The amount of wheels in the car.
	 * @param numberOfDoors The amount of doors in the car.
	 */
	public Car(int numberOfWheels, int numberOfDoors){
		this.wheels = new ArrayList<Wheel>();
		for(int i = 1; i <= numberOfWheels; i++){
			wheels.add(new Wheel(i, false));
		}
		this.doors = new ArrayList<Door>();
		for(int i = 0; i < numberOfDoors; i++){
			doors.add(new Door());
		}
		this.engine = new Engine();
	}
	
	/**
	 * Starts the car's engine.
	 * @return an appropriate message based on the status of the car.
	 */
	public String startCar(){
		return this.engine.start();
	}
	
	/*
	 * Move the wheels, which will in turn make the car move.
	 * @return an appropriate message based on the status of the car.
	 */
	public String move(){
		String str = "";
		for(Wheel w : wheels){
			str += w.start()+'\n';
		}
		return str;
	}
	
	/**
	 * Opens every door in the car.
	 * @return an appropriate message based on the status of the car.
	 */
	public String openDoors(){
		String str = "";
		for(Door d : doors){
			str += d.open()+"\n";
		}
		return str;
	}
	
	/**
	 * Closes every door in this car.
	 * @return an appropriate message based on the status of the car.
	 */
	public String closeDoors(){
		String str = "";
		for(Door d : doors){
			d.close();
		}
		//At this point, you are guaranteed that all the doors
		//this car are closed.
		return ("The doors have closed");
	}
	
	/**
	 * Stops this car's engine.
	 */
	public String stopEngine(){
		return this.engine.stop();
	}
	
	/**
	 * Will stop the wheels of this car from moving.
	 * @return an appropriate message based on the status of the car.
	 */
	public String stopCar(){
		for(Wheel w : wheels){
			w.stop();
		}
		//At this point, you are guaranteed that all the wheels
		//in this car have stopped.
		return ("The Wheels have stopped");
	}
	
}
