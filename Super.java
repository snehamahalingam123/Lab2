
public class Super {
	int num=100;
}
class Subclass extends Super
{
	int num=110;
	void printnumber() {
		System.out.println(super.num);
	}

	public static void main(String[] args) {
		Subclass obj=new Subclass();
		obj.printnumber();
		

	}

}
