/**
 * 
 */

/**
 * @author Viral
 *
 */
public class SUV extends Vehicle {

	//constructor---------------------------------------
	public SUV(String colour, String make, String model, String year) {
		super(colour, make, model, year);
		// TODO Auto-generated constructor stub
		this.numDoors = 5;

	}

	//overriden methods
	@Override
	public void accelerate() {
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
		

	}

	
	@Override
	public void decelerate() {
		this.speed -= 6;
		if(this.speed < 0) {
			this.speed = 0;
		}
		// TODO Auto-generated method stub

	}

}
