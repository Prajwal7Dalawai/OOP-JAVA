package p1;

public class child extends parent{
	child(){
		System.out.println("Inside child,inside package");
		System.out.println("Public: " + pub);
		//System.out.println("Private: "+ pri);
		System.out.println("Protected: " + pro);
		System.out.println("Default: " + d);
	}
}
