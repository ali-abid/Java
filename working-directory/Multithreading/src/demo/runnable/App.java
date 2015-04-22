package demo.runnable;

public class App {

	public static void main(String[] args){
		RunnableDemo r = new RunnableDemo("A");
		RunnableDemo r2 = new RunnableDemo("B");
		RunnableDemo r3 = new RunnableDemo("C");
		
		r.initialize();
		r2.initialize();
		r3.initialize();
	}
}
