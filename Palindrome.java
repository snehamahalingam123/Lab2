import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String original, reverse="";
		Scanner s = new Scanner(System.in);
		System.out.println("enter a String or number to check if it is a palindrome");
		original = s.nextLine();
		int lenght = original.length();
		for(int i = lenght-1;i>=0;i++)
		reverse = reverse + original.charAt(i);
		System.out.println("Reverse : +reverse");
		if(original.equals(reverse))
		{
			System.out.println("entered String/number is a Palindrome");
		}
			else {
				System.out.println("entered String/number is not a Palindrome");
			
			
			}
		}


}


