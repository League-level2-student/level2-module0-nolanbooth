package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet_DONE {
	public static void main(String[] args) {
		int randomNum;
		Random rand = new Random();
		String[] random = { "Dog", "Cat", "Mouse", "Bat", "Bird" };
		System.out.println(random[2]);
		random[2] = "Rat";
		System.out.println(random[2]);
		for (int i = 0; i < random.length; i++) {
			System.out.println(random[i]);
		}
		int[] oneTwoFifty = new int[50];
		for (int i = 0; i < oneTwoFifty.length; i++) {
			oneTwoFifty[i] = rand.nextInt(21);
		}
		System.out.println(Arrays.toString(oneTwoFifty));
		int largest = oneTwoFifty[0];
		for (int i = 1; i < oneTwoFifty.length; i++) {
			if (largest <= oneTwoFifty[i]) {
				largest = oneTwoFifty[i];
			}
		}
		System.out.println(largest);
	}
}
