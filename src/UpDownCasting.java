import javafx.scene.Camera;

import com.aqilix.learning.java.Machine;
import com.aqilix.learning.java.Car;

public class UpDownCasting {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Car car1 = new Car();
		
		machine1.start();
		car1.start();
		car1.toot();
		
		// Upcasting
		Machine machine2 = car1;
		machine2.start();
		// machine2.toot(); // undefineded toot on Machine
		
		// Downcasting
		Machine machine3 = new Car();
		Car car2 = (Car) machine3;
		car2.start();
		car2.toot();
		
		Machine machine4 = new Machine();
		// runtime error
		// Car car3 = (Car) machine4;
		// car3.start();
		// car3.toot();
	}
}
