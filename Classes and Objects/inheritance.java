package classesAndObjects;
import java.util.Scanner;

class person{
	int id;
	String name;
	void display(int id,String name){
		System.out.println("Id of the employee is:"+" "+id);
		System.out.println("Name of the employee is: "+name);
	}
}

class employee extends person{
	float salary;
	String company;
	void display(float salary, String company) {
		super.display(id, name);
		System.out.println("Salary is: "+salary);
		System.out.println("Company: "+company);
	}
}
public class inheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		employee e = new employee();
		System.out.println("Enter name:");
		e.name = sc.next();
		System.out.println("Enter id:");
		e.id = sc.nextInt();
		System.out.println("Enter salary:");
		e.salary = sc.nextFloat();
		System.out.println("Enter Company:");
		e.company = sc.next();
		e.display(e.salary, e.company);
		}

}