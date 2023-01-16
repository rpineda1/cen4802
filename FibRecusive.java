/**
 * Creates a Fibonacci sequence and 
 * prints out the sequence and the 
 * 10th term in that sequence
 * 
 * @author Ricardo Pineda
 * @version "%I%, %G%"
 * @since 1.0
 * @param
 */

package fibSeq;

public class FibRecusive {

	public FibRecusive() {
	
	}
	
	public static void main(String[] args) {

		for (long i=0; i<10; i++) {
			
			System.out.println(fib(i));
			
			// retreves the Fibonacci sequence and prints it out 10 times
			
		}
		
		System.out.println("\n The 10th term of the Fibonacci sequence is: " + fib(9));
		
		// tells the user the 10th term in the Fibonacci sequence
		
	}
	
	/**
	 * 
	 * @param n the nth term in the Fibonacci iteration
	 * @return
	 */
	
	static int fibIteration(int n) {

		int a = 0, b = 1, c = 1;
		
		for (int i = 0; i < 10; i++) {
		
			a = b;
			
			b = c;
			
			c = a + b;
		
		}
		
		return a;
	
	}
	
	/**
	 * 
	 * @param num compares the numbers in the sequence
	 * @return
	 */
	
	public static long fib(long num) {
		
		if (num==0) {
	
			return 0;
		
		}
		
		else if(num==1) {
		
			return 1;
		
		}
		
		return fib(num-1) + fib(num-2);
	
	}

}
