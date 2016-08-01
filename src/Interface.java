import com.aqilix.learning.java.Employee;
import com.aqilix.learning.java.Info;

public class Interface {
	public static void main(String[] args) {
		Employee employee = new Employee();
		if (employee instanceof Info) {
			System.out.println("Info implemented");
		}
	}
}
