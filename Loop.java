
public class Loop {

	public static void main(String[] args) {
    int n =5;
    printnumbers(n);
	}
	public static void printnumbers(int n)
	{
		int i,j;
		for( i=1 ;  i <=1; i++)
		{
			for( j=n-i ;  j >1;  j++)
			{
				System.out.println(i+ " ");
				
			}
			for(  j=1;  j <= i; j++)
			{
				System.out.println(j+  " ");
			}
			System.out.println();
		}

	}

}
