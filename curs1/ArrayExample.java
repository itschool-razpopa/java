public class ArrayExample {
	public static void main(String[] args) {
		int i[] = new int[5];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		System.out.println(i.length);

		String[] message = new String[] {"un", " mesaj"};
		System.out.println(message[0] + message[1]);

		float[] collectionNumbers = new float[] {1.2F, 3.0F};
		collectionNumbers[1] = 5.0F;

		System.out.println(collectionNumbers[1]);
	}
}