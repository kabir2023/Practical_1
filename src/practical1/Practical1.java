package practical1;

import java.util.Random;

public class Practical1 {
	public static int a = 0, small = 500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random number = new Random();
		int RandomNumber;

		for (int i = 0; i < 500; i++) {
			RandomNumber = number.nextInt(500);
			System.out.println(RandomNumber);

			a = number.nextInt(500);
			System.out.println(a);

			if (a < small)
				small = a;
		}

		System.out.println("small number is :" + small);

	}

}
