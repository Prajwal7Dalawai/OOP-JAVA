package classesAndObjects;
class mobileOS{
	void display() {
		System.out.println("This is mobile operating sysytem.");
	}
}

class android extends mobileOS{
	void display() {
		super.display();
		System.out.println("This is android operating system");
	}
}

class ios extends mobileOS{
	void display() {
		super.display();
		System.out.println("This is IOS operating system.");
	}
}
public class hierarchical_inheritance {

	public static void main(String[] args) {
		mobileOS os = new mobileOS();
		os.display();
		
		os = new android();
		os.display();
		
		os = new ios();
		os.display();
	}

}
