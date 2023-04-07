package Exception;

public class TryCatch {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int c = 0;
		System.out.println("hello");
		try {
			System.out.println("risky code");
			c = a / b;
		}

		catch (ArithmeticException AE) {

			b = 5;
			c = a / b;
			System.out.println("alternative code");
		}
		System.out.println(c);

	}
}


