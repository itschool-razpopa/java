public class Objects {
	
	public static void main(String[] args) {
		String message = saySomething("Something 3");
		System.out.println(message);
	}

	public static String saySomething() {
		return "Something2";
	}

	public static String saySomething(String message) {
		return message;
	}
}