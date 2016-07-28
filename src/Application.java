import com.aqilix.learning.java.Person;

public class Application {
	public static void main(String[] args) {
		Person newPerson = new Person();
		newPerson.setName("Foo");
		newPerson.setAge(10);
		newPerson.displayInfo();
		newPerson.move("left", 10.0);
		newPerson.move("right", 9.8);
	}
}
