
public class Box {

	
	int lenght,breadth,height;
	Box(int l,int b,int h)
	{
		lenght=l;
		breadth=b;
		height=h;
	}
	public void display()
	{
		int volume=lenght*breadth*height;
		System.out.println("volume of Box is " +volume);
		
		

	}

}
class Boxdemo
{
	public static void  main(String args[]) { 
		Box b=new Box(10,20,30);
		  b.display();
	}
}

