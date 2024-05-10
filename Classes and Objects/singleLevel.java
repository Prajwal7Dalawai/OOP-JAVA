package classesAndObjects;
class parent{
	int p;
	parent(int p){
		this.p = p;
	}
	void display() {
		System.out.println("Value through parent:"+p);
	}
}
class child extends parent{
	int c;
	child(int c, int p){
		super(p);
		this.c = c;
	}
	void display() {
		System.out.println("Values set to child="+p+","+c);
	}
}
public class singleLevel {

	public static void main(String[] args) {
		System.out.println("Parent to Parent:");
		parent p1 = new parent(18);
		p1.display();
		
		System.out.println("Child to child");
		child c = new child(8,18);
		c.display();
		
		System.out.println("Parent to Child");
		parent c1 = new child(8,18);
		c1.display();
	}

}
