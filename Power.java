package leetCode;

public class Power {

    public static void main(String[] args) {
		System.out.println(myPow(10.0,-600));
	}
    public static double myPow(double x, int n) {
        if(n < 0) {
        	return 1/simplePow(x,n * -1); 
        }else{
        	return simplePow(x,n);
        } 
    }
    
   public static double simplePow(double x, int n) {
        if(n >= 1) {
        	return x*myPow(x,n-1); 
        }else{
        	return 1;
        } 
    }
}
