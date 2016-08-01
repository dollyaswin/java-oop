import com.aqilix.learning.java.Thing;

public class Static {
	
	public static void main(String[] args) {
		Thing.description = "I'am a thing";
		Thing.displayInfo();
		Thing.displayCounter();

		Thing thing1 = new Thing();
		thing1.setName("First");
		thing1.displayName();
		Thing.displayInfo();
		Thing.displayCounter();

		Thing thing2 = new Thing();
		thing2.setName("Second");
		thing2.displayName();
		Thing.displayInfo();
		Thing.displayCounter();
	}
	
	
}
