package basic;
public class Reversenumber {
	public static void main(String[] args) {
		  int num = 1234, reversed = 0, digit;
		    while(num != 0) {
		     digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
		  }
	}
