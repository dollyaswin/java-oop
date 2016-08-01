import com.aqilix.learning.java.Thing;

public class Tostring {
	public static void main(String[] args) {
		Thing thing1 = new Thing();
		thing1.setName("Foo");

		Thing thing2 = new Thing();
		thing2.setName("Bar");
		
		System.out.println(thing1);
		System.out.println(thing2);
	}
}
