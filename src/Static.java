import com.aqilix.learning.java.Thing;

public class Static {
	public static void main(String[] args) {
		Thing.description = "I'am string";
		Thing.displayInfo();
		
		Thing thing1 = new Thing();
		thing1.setName("First");
		thing1.displayName();
		thing1.displayInfo();
		
		Thing thing2 = new Thing();
		thing2.setName("Second");
		thing2.displayName();
		thing2.displayInfo();
	}
}
