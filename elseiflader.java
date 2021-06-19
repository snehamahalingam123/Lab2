import java.util.Scanner;

public class elseiflader {
	public static void main(String[] args ) {
		int month;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the month:");
		month = s.nextInt();
		String season;
		if(month == 12 || month == 1 || month == 2)
		{
			season = "winter";
		}
		else if (month == 3 || month == 4 || month == 5)
		{
			season = "spring";
			
		}
		else if(month == 6 || month == 7 || month == 8)
		{
			season = "summer";
			
		}
		else if (month == 9 || month == 10 || month == 11)
		{
			season =" Autumn";
			
		}
		else
		{
			season = "Bogus month";
			
		}
		System.out.println(month + " is in the " + season);
	}


}
