
public class shape {
	public void display()
	{
		System.out.println("inside display");
	}
}
class rectangle extends shape{
	public void area() {
		System.out.println("insisde area");
	}
}
class Cube extends rectangle{
	public void volume()
	{
		System.out.println("inside volume");
	}
}
class tester{
	public static void main(String[] args) {
		Cube cube =  new Cube();
		cube.display();
		cube.area();
		cube.volume();
	}
}
	


