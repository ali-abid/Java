package demo.runnable;

public class RunnableDemo implements Runnable {

	private Thread t;
	private String threadName = "A";
	
	RunnableDemo(){
		System.out.println("Calling Constructor...");
	}
	
	public void run(){
		System.out.println("Calling run function..");
	}
	
	public void initialize(){
		t = new Thread(this, threadName);
		t.start();
	}
}