package fibSeq;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibRecusiveTest {

	private FibRecusive fibRecusive = new FibRecusive();
	
	@SuppressWarnings("static-access")
	@Test
	
	// sets the nth term of the Fibonacci sequence for testing as "result"
	public void testFib() {
		int result = 34;
		
		// compares the term in the Fibonacci sequence with the index
		Assertions.assertEquals(result,fibRecusive.fib(9) );
	}
	
}
