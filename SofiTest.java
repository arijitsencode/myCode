package leetCode;

public class SofiTest {

	private static boolean ready;
	private static int number;
	private static class ReaderThread extends Thread{
		public void run(){
			while(!ready){
				Thread.yield();
			}
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReaderThread().start();
		number = 4;
		ready = true;
			
	}

}
