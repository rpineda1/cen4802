package fibSeq;

public class FibRecusive {

	public static void main(String[] args) {

		for (long i=0; i<10; i++) {
			System.out.println(fib(i));
		}
		System.out.println("\n The 10th term of the Fibonacci sequence is: " + fib(9));
	}
	static int fibIteration(int n) {
		int a = 0, b = 1, c = 1;
		for (int i = 0; i < 10; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		return a;
	}
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
