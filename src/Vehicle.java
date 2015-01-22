/**
 * 
 */

/**
 * @author Viral
 * Class Description: 
 *
 */
public abstract class Vehicle {
	
	//PRIVATE properties-----------------------------------------------------------
	
	protected int numWheels = 4;
	protected int numDoors = 2;
	private String colour = "";
	private String make = "";
	private String model = "";
	private String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;
	
	//PUBLIC getters----------------------------------------------------------------
	
	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return this.colour;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}
	
	//CONSTRUCTORs-------------------------------------------------------------
	public Vehicle(int wheels, int doors, String colour, String make, String model , String year) {
		this.numWheels = wheels;
		this.numDoors = doors;
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;	
	}
	
	public Vehicle(String colour, String make, String model , String year) {
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;	
	}
	
	//PUBLIC abstract methods----------------------------------------------------------
		
	public abstract void accelerate();
	
	public abstract void decelerate();
	
	//public methods-----------------------------------
	
	public void turnLeft() {
		System.out.println("Turning Left");
		
	}
	
	public void turnRight() {
		System.out.println("Turning Right");
		
	}
	
	public float getSpeed() {
		return speed;
	}
	
}
