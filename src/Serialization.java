import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.aqilix.learning.java.Employee;

public class Serialization {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("John");
		employee.setAge(20);
		employee.setId("16090845");
//		System.out.println(employee);
		System.out.println("Serializing Object: " + employee);
		
		String dataDir  = "data";
		String filename = "employee.bin";
		String filepath = System.getProperty("user.dir") + "/" + dataDir + "/" + filename;
		try (FileOutputStream fs  = new FileOutputStream(filepath)) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(employee);
			os.close();
			System.out.println("Success.");
		} catch (FileNotFoundException e) {
			System.out.println("Fail. " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Fail. " + e.getMessage());
		}
	}
}
