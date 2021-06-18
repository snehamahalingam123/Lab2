import java.util.Scanner;

public class Area 
{

	public static void main(String[] args) 
	{
		int r,h=0;
		double pi = 3.14,area;
		Scanner s = new Scanner(System.in);
		System.out.println("enter radius of circle:");
		r = s.nextInt();
		area = pi * r * r +2*pi*r*h;
		System.out.println("Area of circle:"+area);
	}

}
