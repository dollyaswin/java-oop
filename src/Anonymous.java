import com.aqilix.learning.java.Car;
import com.aqilix.learning.java.Info;

public class Anonymous {
	public static void main(String[] args) {
		Car car1 = new Car() {
			@Override
			public void start() {
				System.out.println("anonymous start");
			}
		};
		
		Info info = new Info() {
			@Override
			public void displayInfo() {
				System.out.println("anonymous interface info");
			}
		};
		
		car1.start();
		info.displayInfo();
		
	}
}
