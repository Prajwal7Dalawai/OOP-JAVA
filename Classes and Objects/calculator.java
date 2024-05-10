package classesAndObjects;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st operand:");
		float n1 = sc.nextFloat();
		System.out.println("Enter the operator for the calculation:");
		char o = sc.next().charAt(0);
		float result = 0;
		if (o  == '/') {
			System.out.println("Make sure that the second operand is zero(0)");
		}
		System.out.println("Enter the second operand:");
		float n2 = sc.nextFloat();
		switch(o) {
		case '+': result = n1 + n2;
				break;
		case '-': result = n1-n2;
				break;
		case '*': result = n1 * n2;
				break;
		case '/': result = n1 / n2;
				break;
		case '%': result = n1 % n2;
				break;
		default: System.out.println("Invalid Operand!!");
		break;
		}
		System.out.println(n1 + " " + o + " " + n2 + " " + " = " + result);
	}

}
