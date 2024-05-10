package classesAndObjects;
import java.util.Scanner;

class areaAndPerimeter{
	float area(float s) {
		return s*s;
	}
	float perimeter(float s) {
		return 4*s;
	}
	float area(float s,float r) {    //Method overloading of above area method.
		return s*r;
	}
	float perimeter(float s,float r) {		//Methos overloading of above perimeter method
		return (2*(s+r));
	}
}

public class sqaureAndRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Creating object of scanner class
		areaAndPerimeter s = new areaAndPerimeter();
		System.out.println("On which shape you want to perform operation?");
		System.out.println("Press r/R for Rectangle");		
		System.out.println("Press s/S for Square:");
		char choice = sc.next().charAt(0);		//taking input of user choice
		switch(choice) {
		case 'r':
		case 'R': 		//Calculating Area and perimeter for rectangle
			System.out.println("Enter the length of rectangle:");
			float l = sc.nextFloat();
			System.out.println("Enter the breadth of rectangle:");
			float b = sc.nextFloat();
			System.out.println("Area of Rectangle is "+s.area(l, b));
			System.out.println("Perimeter of rectangle is "+s.perimeter(l, b));
			break;
		
		case 's':
		case 'S':		//Calculating Area and perimeter for Square
			System.out.println("Enter the side of the sqaure:");
			float a= sc.nextFloat();
			System.out.println("Area of square is "+s.area(a));
			System.out.println("Perimeter of sqaure is: "+s.perimeter(a));
			break;
			}
	}

}
