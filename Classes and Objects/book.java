package classesAndObjects;
import java.util.Scanner;

class bookDetails{
	String title;
	String author;
	String type;
	float price;
	bookDetails(){
		this.price = price;
	}
	float discount10() {
		return (price - price*0.10F);
	}
	float discount15() {
		return (price - price*0.15F);
	}
}
public class book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bookDetails s = new bookDetails();
		System.out.println("Enter the Title of the book:");
		s.title = sc.next();
		System.out.println("Enter the author of the book:");
		s.author = sc.next();
		System.out.println("Enter the type(technical/non-technical) of the book:");
		s.type = sc.next();
		System.out.println("Enter the price of the book:");
		s.price = sc.nextFloat();
		System.out.println("The title of the book is :"+s.title);
		System.out.println("The author of the book is :"+s.author);
		System.out.println("The type of the book is :"+s.type);
		switch(s.type) {
		case "technical": System.out.println("The price of the book is "+s.discount10());
		break;
		case "non-technical": System.out.println("The price of the book is "+s.discount15());
		}
	}
}
