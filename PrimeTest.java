
public class PrimeTest {
	public static void main( String args[ ] )
	{
		int i, n;
		boolean  flag = true;
		
		n = 29;		

		for( i=2 ; i<=n/2 ; i++ )
		{
			if( n % i == 0 )
			{
				flag = false;
				break;
			}
		}
		
		if( flag == true )
			System.out.print( "\n Number " + n + " is a PRIME Number." );
		else
			System.out.print( "\n Number " + n + " is NOT a PRIME Number." );
	}


}
