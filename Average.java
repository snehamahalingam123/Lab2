import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		System.out.println(averageOdd(n));
	}
	static  int averageOdd(int n) {
		if(n%2==0) {
			System.out.println("invalid input!");
			return -1;
			
		}
		int sum =0, count=0;
		while(n>= 1) {
	
			count++;
			sum+=n;
			n=n-2;
			
			
		}
		return sum/count;
	}

		
		
	

	}

}
