import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		System.out.println("enter an integer:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(+num+"X"+i+"="+(num*i));
			
		}

	}

}
