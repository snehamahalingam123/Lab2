import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter character  ");
		char c= ((scan.nextLine()).charAt(0));
		char z= Character.toUpperCase(c);
		
		switch(z)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c+ " is a Vowels");
		break;
		default:
			System.out.println(c+ " is a non Vowels");
			
		
		
		
		
	
		
		}
			
		

	}

}
