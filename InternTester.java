package concepts;

public class InternTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "avv";
		String b = "avv";
		String c = new String("avv");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//System.out.println(a.intern()==c.intern());
		c = c.intern();
		System.out.println(a==c);
		//System.out.println(a==c);
		//System.out.println(a.equals(c));
		//System.out.println(c==b);
		//System.out.println(b.equals(c));

	}

}
/*
 * true
true
false
true
false
true

 * */
