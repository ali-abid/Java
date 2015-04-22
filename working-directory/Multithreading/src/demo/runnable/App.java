package demo.runnable;

public class App {

	public static void main(String[] args){
		RunnableDemo r = new RunnableDemo("A");
		RunnableDemo r2 = new RunnableDemo("B");
		r.initialize();
		r2.initialize();
	}
}
