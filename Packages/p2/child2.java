package p2;
 import p1.*;
public class child2 extends parent{
	child2(){
		super();
		System.out.println("Inside Child, but outside package");
		System.out.println("Public: " + pub);
		//System.out.println("Private: "+ pri);
		System.out.println("Protected: " + pro);
		//System.out.println("Default: " + d);
	}
}
