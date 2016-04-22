class studentDB{
        int ID;
	String college = "XYZ";

	studentDB(int i){
		ID = i;
         }
void display(){System.out.println(ID+ " " +college);}

public static void main(String args[]){

	studentDB s1 = new studentDB(1);
	studentDB s2 = new studentDB(2);
        studentDB s3 = new studentDB(3);

	s1.display();
        s2.display();
        s3.display();
	
}


}