public class RuntimeExceptionHandling {
	public static void main(String[] args) {
		try {
			int value = 7;
			value = value/0;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		try {
			String[] texts = {"one", "two", "three"};
			System.out.println(texts[3]);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
