class staticVariable{

	int id;
	static String company = "xyz";

	staticVariable(int i){
		id = i;
	}
	void display(){System.out.println(id+ " " + company);}
	public static void main(String args[]){
		staticVariable s0 = new staticVariable(1);	
		staticVariable s1 = new staticVariable(2);	
		staticVariable s2 = new staticVariable(3);	
				
		s0.display();
		s1.display();
		s2.display();
	}



}