package p1;

public class nonchild {
	parent p1 = new parent();
	nonchild(){
		System.out.println("Inside non child, inside package");
		System.out.println("Public: " + p1.pub);
		//System.out.println("Private: "+ p1.pri);
		System.out.println("Protected: " + p1.pro);
		System.out.println("Default: " + p1.d);
	}
}
