package javaThreads;
import java.lang.Exception;
class NewThread extends Thread{
	NewThread(){
		//create a new, second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		//start();
	}
	public void run() {
		try {
			for(int i = 5; i>0; i--) {
				System.out.println("Child thread: " + i);
			}
		}
		catch(Exception e) {
			System.out.println("Chid thread interrupted " + e);
	}
		System.out.println("End of child thread");
}

 class extendThread {

	public void main(String args[]) {
		NewThread t1 = new NewThread();
		t1.start();
		try {
				for(int i = 5; i>0; i--) {
					System.out.println("Main thread: " + i);
			}
		}
			catch(Exception e) {
				System.out.println("Chid thread interrupted " + e);
		}	
		System.out.println("End of Main thread");
	}
}
}
