package p2;
 import p1.*;
public class nonchild2 {
	parent p2 = new parent();
	nonchild2(){
		System.out.println("Inside non-child, outside package");
		System.out.println("Public: " + p2.pub);
		//System.out.println("Private: "+ p2.pri);
		//System.out.println("Protected: " + p2.pro);
		//System.out.println("Default: " + p2.d);
	}
}
