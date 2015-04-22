package demo.runnable;

public class RunnableDemo {

	private Thread t;
	
	public void initialize(){
		t = new Thread();
		t.start();
	}
}