package demo.runnable;

public class RunnableDemo implements Runnable {

	private Thread t;
	private String threadName;;
	
	RunnableDemo(String name){
		threadName = name;
		System.out.println("Calling Constructor...");
	}
	
	public void run(){
		System.out.println("Calling run function..");
			try {
				for(int i = 4; i > 0; i--){
					System.out.println("Thread Name: " + threadName + " , "+  i);
					Thread.sleep(50);
			}
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	public void initialize(){
		t = new Thread(this, threadName);
		t.start();
	}
}