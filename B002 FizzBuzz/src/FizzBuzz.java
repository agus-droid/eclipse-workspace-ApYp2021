
public class FizzBuzz {
	public static void FizzBuzzMetodo(int Cantidad) {
		for (int i = 1; i <= Cantidad; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}
		}
		;
	}
}
