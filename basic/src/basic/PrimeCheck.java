package basic;
import java.util.Scanner;
public class PrimeCheck {
	public static void main(String[] args) {
		int temp, num, i;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
				num=scan.nextInt();
		scan.close();
		for(i=2;i<=num/2;i++)
		{
		temp=num%i;
		if(temp==0)
		{
		isPrime=false;
		break;
		}
		}
				if(isPrime)
		System.out.println(num + " is a Prime Number");
		else
		System.out.println(num + " is not a Prime Number");
	}

}

