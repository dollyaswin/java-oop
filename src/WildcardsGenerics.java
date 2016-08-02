import java.util.ArrayList;
import com.aqilix.learning.java.Machine;
import com.aqilix.learning.java.Car;

public class WildcardsGenerics {

	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Car> list2 = new ArrayList<Car>();
		list2.add(new Car());
		list2.add(new Car());
		
		showList1(list2);
		showList2(list1);
		showList3(list1);
	}

	public static void showList1(ArrayList<? extends Machine> list) {
		for (Machine value: list) {
			System.out.println(value);
			value.start();
		}
	}
	
	public static void showList2(ArrayList<? super Car> list) {
		for (Object value: list) {
			System.out.println(value);
		}
	}
	
	public static void showList3(ArrayList<?> list) {
		for (Object value: list) {
			System.out.println(value);
		}
	}
}
