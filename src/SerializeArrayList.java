import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import com.aqilix.learning.java.Employee;

public class SerializeArrayList {
	public static void main(String[] args) {
		System.out.println("Serializing ArrayList...");
		String dataDir  = "data";
		String filename = "employees.bin";
		String filepath = System.getProperty("user.dir") + "/" + dataDir + "/" + filename;
		// employee collection
		Employee[] employees = {new Employee("010304559", "Foo"), new Employee("020304476", "Bar")};
		ArrayList<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(employees));
		
		try (FileOutputStream fs = new FileOutputStream(filepath); ObjectOutputStream os = new ObjectOutputStream(fs)) {
			os.writeObject(employees);
			os.writeObject(employeeList);
			os.writeInt(employeeList.size());
			
			for (Employee employee: employeeList) {
				os.writeObject(employee);
			}
			
			System.out.println("Success.");
		} catch (FileNotFoundException e) {
			System.out.println("Fail. " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Fail. " + e.getMessage());
		}
	}
}
