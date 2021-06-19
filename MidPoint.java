import java.util.Scanner;

public class MidPoint {

	public static void main(String[] args) {
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value for i: ");
		i = s.nextInt();
		System.out.println("enter the value for j: ");
		j = s.nextInt();
		while(++i < --j);
		System.out.println("MidPoint is :" +i);

	}

}
 