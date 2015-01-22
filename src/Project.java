/**
 * 
 */

/**
 * @author Viral
 * @version 0.2 - added vehicle class
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SUV myHonda = new SUV("black", "honda", "pilot", "2015");
		
		Truck myTruck = new Truck(6, 3, "white", "ford", "FX", "2008");
		
		for(int seconds = 0; seconds < 10; seconds++) {
			myHonda.accelerate();
			myTruck.accelerate();
		}
		System.out.println(myHonda.getSpeed());
		System.out.println("Truck: "+ myTruck.getSpeed());
	
	}

}
