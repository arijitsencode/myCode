package concepts;

public class RecursionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionTest recursionTest = new RecursionTest();
		System.out.println(recursionTest.factorial(4));

	}
	
	int factorial(int f){
		if (f == 1){
			return 1;
		}
		else
			return f*factorial(f-1);
		
	}

}
