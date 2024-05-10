package p1;

public class parent {

	public int pub =10;
	private int pri = 20;
	protected int pro = 30;
	int d = 40;
	
	public parent(){
		System.out.println("Inside Parent");
		System.out.println("Public: " + pub);
		System.out.println("Private: "+ pri);
		System.out.println("Protected: " + pro);
		System.out.println("Default: " + d);
	}
	
}
