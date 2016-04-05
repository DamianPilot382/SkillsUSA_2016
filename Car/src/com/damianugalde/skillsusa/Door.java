package com.damianugalde.skillsusa;

/**
 * 
 * Simulates a door object that can be opened and closed.
 * 
 * @author Damian Ugalde
 * @date 2016-04-02
 */
public class Door {
	
	private boolean isOpen;
	
	/**
	 * Creates a new door object with a default value of closed.
	 */
	public Door(){
		this.isOpen = false;
	}
	
	/**
	 * Creates a new door object.
	 * @param isOpen value for the door's position. True for open, false for closed.
	 */
	public Door(boolean isOpen){
		this.isOpen = isOpen;
	}
	
	/**
	 * Checks if the door is open and closes it. On the other hand, if the door is closed, it will open it.
	 */
	public void toggleOpen(){
		isOpen = !isOpen;
	}
	
	/**
	 * Closes the door.
	 * @return an appropriate message based on the status of the door.
	 */
	public String close(){
		isOpen = false;
		return printStatus();
	}
	
	/**
	 * Opens the door.
	 * @return an appropriate message based on the status of the door.
	 */
	public String open(){
		isOpen = true;
		return printStatus();
	}
	
	/**
	 * Checks if the door is open or not
	 * @return True if the door is open, false otherwise.
	 */
	public boolean isDoorOpen(){
		return isOpen;
	}
	
	public String printStatus(){
		if(isOpen) return ("This door has opened");
		else return ("This door has closed");
	}
	

}
