/**
 * 
 */

/**
 * @author Viral
 *
 */
public class Truck extends Vehicle {
	
	//CONSTRUCTORS---------------------------------------------
	public Truck(int wheels, int doors, String colour, String make,
			String model, String year) {
		super(wheels, doors, colour, make, model, year);
		// TODO Auto-generated constructor stub
		
		checkNumDoors(); 
	}
		// PRIVATE METHOD----------------------------------------------
		private void checkNumDoors() {
			if(this.numDoors < 3) {
				this.numDoors = 3;
			}
		}
		
		//OVERRIDEN METHODS--------------------------------------------------
		@Override
		public void accelerate() {
			this.speed += 2;
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
		}
}


