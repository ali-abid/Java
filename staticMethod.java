class staticMethod{
	int id;
	static String college = "CommonPropertyOfAllObjects";
	staticMethod(int i){
		id = i;
	}

	void display(){System.out.println(id+ " " +college);}

	//static method example
	static void change(){
		college = "changed";
	}
public static void main(String args[]){
	staticMethod.change();
	staticMethod s1 = new staticMethod(1);
	staticMethod s2 = new staticMethod(2);
	staticMethod s3 = new staticMethod(3);
	
	s1.display();
	s2.display();
	s3.display();

}

}