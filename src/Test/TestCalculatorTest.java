package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void test() {
	
			assertEquals("Error in Addition operation()",3,java.Calculator.add(1, 2));
			assertEquals("Error in Addition operation()",-3,java.Calculator.add(-1, -2));
			assertEquals("Error in Addition operation()",9,java.Calculator.add(9, 0));
		
		
	}

}
