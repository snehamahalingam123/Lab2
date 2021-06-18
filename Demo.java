
public class Demo {

	public static void main(String[] args) {
		OverloadDemo obj= new OverloadDemo();
		obj.area(5);
		obj.perimeter(10);
		obj.areaofrectangle(9,7);
		obj.perimeterofrectangle(6,7);
		
		

	}

}
class OverloadDemo{
	public void area(float  x) {
		float area;
		area = x*x;
		System.out.println("the area of square is:" +area);
		
	}
	public void perimeter(float x) {
		float perimeter;
		perimeter=4*x;
		System.out.println("the perimeter of square is" +perimeter);
	}
	public void areaofrectangle(float x, float y) {
		float areaofrectangle;
		areaofrectangle = x*y;
		System.out.println("the area of rectangle is" +areaofrectangle);
	}
	public void perimeterofrectangle(float x, float y) {
		float perimeterofrectangle;
		perimeterofrectangle = (2*x)+(2*y);
		System.out.println("the perimeter of rectangle is" +perimeterofrectangle);
	}
		
		
	
	
}