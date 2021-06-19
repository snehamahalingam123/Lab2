import java.util.Scanner;

public class switchmonth {

	public static void main(String[] args) {
		String season;
	  System.out.println("enter the season");
	  Scanner s = new Scanner(System.in);
	   int inp  = s.nextInt();
	   switch(inp) {
	   case 12:
	   case 1:
	   case 2:
		season =" winter";
		break;
	   case 3:
	   case 4:
	   case 5:
		   season ="spring";
		   break;
	   case 6:
	   case 7:
	   case 8:
		   season ="summer";
		   break;
	   case 9:
	   case 10:
	   case 11:
		   season ="autumn";
		   break;
		   default:
			   season ="not  an season";
			   
			    
			   System.out.println("entered month" +season);
		   
	   
	   }
	  
		

	}

}
