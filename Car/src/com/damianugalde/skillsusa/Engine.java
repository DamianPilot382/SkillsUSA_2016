package com.damianugalde.skillsusa;

/**
 * This class simulates an engine, which can be turned on or off.
 * @author Damian Ugalde
 * @date 2016-04-02
 */
public class Engine {
	
	private boolean isRunning;
	
	/**
	 * Creates an engine with a default value off.
	 */
	public Engine(){
		isRunning = false;
	}
	
	/**
	 * Creates an engine that can be instantiated with an on/off option provided by the user.
	 * @param isRunning Default value for the engine. True for on, false for off.
	 */
	public Engine(boolean isRunning){
		this.isRunning = isRunning;
	}
	
	/**
	 * Starts the engine.
	 * @return an appropriate message based on the status of the engine.
	 */
	public String start(){
		isRunning = true;
		return printStatus();
	}
	
	/**
	 * Stops the engine's motion.
	 * @return an appropriate message based on the status of the engine.
	 */
	public String stop(){
		isRunning = false;
		return printStatus();
	}
	
	/**
	 * If the engine is currently running, it will stop it. On the other hand, if the engine is turned off,
	 * it will start the engine.
	 */
	public void toggleRunning(){
		isRunning = !isRunning;
	}
	
	/**
	 *  Checks if the engine is running or not.
	 * @return True if the engine is on, false otherwise.
	 */
	public boolean isEngineRunning(){
		return isRunning;
	}
	
	/**
	 * Checks the status of the engine's motion and outputs an appropriate message to the console.
	 */
	public String printStatus(){
		if(isRunning) return ("The engine is running");
		else return ("The engine has stopped");
	}
	
}
