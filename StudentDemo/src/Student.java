
public class Student 
{
	int rollno;  
	 String name;  
	 void insertRecord(int r, String n){  
	  rollno=r;  
	  name=n;  
	 }  
	 void displayInformation()
	 {
		 System.out.println(rollno+" "+name);
	 }  
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student s1=new Student();  
		  Student s2=new Student();  
		  s1.insertRecord(111,"GOPI");  
		  s2.insertRecord(222,"KRISHNA");  
		  s1.displayInformation();  
		  s2.displayInformation();  
	}

}
