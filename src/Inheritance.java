import com.aqilix.learning.java.Employee;

public class Inheritance {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId("0019081");
		employee.setName("Foo");
		employee.setAge(20);
		employee.displayInfo();
	}
}
