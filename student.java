
public class student {
	String name,city;
  int age;
  static int m;
  void printdata() {
	  System.out.println("Student name = " +name);
	  System.out.println("Student city = " +city);
	  System.out.println("Student age = " +age);
  }
}
class stest {
	public static void main(String args[]) {
		student s1=new student();
		student s2=new student();
		s1.name="nikith";
		s1.city="Rajahmundry";
		s1.age=22;
		s2.name="Megana";
		s2.city="Mumbai";
		s2.age=21;
		s2.printdata();
		
		s1.printdata();
		s1.m=20;
		s2.m=22;
		student.m=27;
		System.out.println("s1.m = "+s1.m);
		System.out.println("s2.m = "+s2.m);
		System.out.println("student.m ="+student.m);
	}
}
		
		
		
	

	
		

	


