package basic;
import java.util.Scanner;
public class AreaOfCircle {
		public static void main(String[] args) {
		System.out.print("Enter the radius: ");
		Scanner scan = new Scanner(System.in);
     	double radius = scan.nextDouble();
    	double area = Math.PI * (radius * radius);
    	System.out.println("The area of circle is: " + area);
        double circumference= Math.PI * 2*radius;
		System.out.println( "The circumference of the circle is:"+circumference) ;
		scan.close();
	}

}
