package basic;
public class QuotientAndRemainder {
	public static void main(String[] args) {
		int number1 = 150, number2 = 20;
		int quotient = number1 / number2;
		// To get a division without remainder we use the division operator
		int remainder = number1 % number2;
		//For remainder we use the modulas operator
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
	}
}
