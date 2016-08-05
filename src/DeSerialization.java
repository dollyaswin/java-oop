import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aqilix.learning.java.Employee;

public class DeSerialization {
	public static void main(String[] args) {
		System.out.println("Deserializing object...");
		
		String dataDir  = "data";
		String filename = "employee.bin";
		String filepath = System.getProperty("user.dir") + "/" + dataDir + "/" + filename;
		try (FileInputStream fs  = new FileInputStream(filepath)) {
			ObjectInputStream os = new ObjectInputStream(fs);
			Employee employee = (Employee) os.readObject();
			os.close();
			
			System.out.println(employee);
		} catch (FileNotFoundException e) {
			System.out.println("Success.");
		} catch (IOException e) {
			System.out.println("Fail. " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Fail. " + e.getMessage());
		}
	}
}
