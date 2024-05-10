package classesAndObjects;

import java.util.Scanner;

class circle{
	float r;
	circle(){
		this.r = 0.0F;
	}
	circle(float r){
		this.r = r;
	}
	float area() {
		return 3.142F*r*r;
	}
	float circumferrence() {
		return 2*3.142F*r;
	}
}

public class areaOfCircle {

	public static void main(String[] args) {
//		System.out.println("Hello Prajwal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		float rad = sc.nextFloat();
		circle c = new circle(rad);
		System.out.println("Area of Circle = "+c.area());
		System.out.println("Circumferrence of the circle is = "+c.circumferrence());
	}

}
