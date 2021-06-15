
class Bool {

	public static void main(String[] args) {
		Boolean a =true, b = false, c,d,e,f,g;
			
        c=a|b;
        System.out.println("value of c"+c);
        d=a&b;
        System.out.println("value of d "+c);
        e= a^b;
        System.out.println("value of e "+e);
        f= (!a&b) | (a&!b);
        System.out.println("value of f " +f);
        g=!a;
        System.out.println("value of g " +f);
        
	}

}
