/**
 * 
 */

/**
 * @author Viral
 * Class Description: 
 *
 */
public class Vehicle {
	
	//PRIVATE properties-----------------------------------------------------------
	
	private int numWheels = 4;
	private int numDoors = 2;
	private String colour = "";
	private String make = "";
	private String model = "";
	private String year = "";
	private float speed = 0;
	private final int MAX_SPEED = 40;
	
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
	
	//CONSTRUCTOR-------------------------------------------------------------
	public Vehicle() {
		
	}
	
	//PUBLIC methods----------------------------------------------------------
		
	public void accelerate() {
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
			
	}
	
	public void decelerate() {
		this.speed -= 6;
		if(this.speed < 0) {
			this.speed = 0;
		}
	}
	
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
