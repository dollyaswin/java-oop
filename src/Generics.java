import java.util.ArrayList;
import java.util.HashMap;
import com.aqilix.learning.java.Machine;

public class Generics {

	public static void main(String[] args) {
		// before java 5
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		
		// modern style
	    ArrayList<String> strings = new ArrayList<String>();
	    strings.add("cat");
	    strings.add("dog");
	    strings.add("alligator");
	    String  animal = strings.get(1);
	    
	    System.out.println(animal);
	    
	    HashMap<Integer, String> map = new HashMap<Integer, String>();
	    
	    ArrayList<Machine> machineList = new ArrayList<Machine>();
	}

}
