import com.aqilix.learning.java.Employee;

public class Application {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Foo");
		employee.setAge(10);
		employee.displayInfo();
		employee.move("left", 10.0);
		employee.move("right", 9.8);
	}
}
