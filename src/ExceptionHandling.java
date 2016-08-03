import com.aqilix.learning.java.Testing;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionHandling {
	public static void main(String[] args) {
		Testing testing = new Testing();
		
		try {
			testing.run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}
}
