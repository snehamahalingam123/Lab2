
import java.util.Scanner;

public class primewhile {

	public static void main(String[] args) {
	int number;
	Scanner s =  new Scanner(System.in);
	System.out.println("enter the number");
	number = s.nextInt();
	int n = 2;
	int divisiblecount = 0;
	while (n <= number/2)
	{
		if(number% n==0) {
			divisiblecount++;
			break;
			
		}
		n++;
	}
	if (divisiblecount == 0) {
		System.out.println(number + "is a prime number");
		
	}
	else {
		System.out.println(number + " is not a prime number");
		
	}
	
	

	}

}
