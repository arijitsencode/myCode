package concepts;


import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {

			getRandomNumberInRange(10, 20);

	}

	private static void getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt((max - min) + 1) + min); 
		}
	}

}

