package javaThreads;
//import java.lang.Exception;
public class currentThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: "+ t);
		//change the name of the thread
		t.setName("My Thread");
		System.out.println("After name change: " + t);
		Thread t1 = new Thread();
		System.out.println("Child thread: " + t1 );
		t1.setName("Child-1");
		System.out.println("After name change: " + t1);
		try {
			for (int i=5;i>0;i--) {
				System.out.println(i);
				Thread.sleep(3000);
			}
		}
			catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}

}
