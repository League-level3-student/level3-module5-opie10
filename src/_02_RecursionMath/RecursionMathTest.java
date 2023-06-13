package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(25, RecursionMath.recursiveMultiplication(5, 5));
        assertEquals(72, RecursionMath.recursiveMultiplication(9, 8));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(10, RecursionMath.recursiveDivision(90, 9));
        assertEquals(12, RecursionMath.recursiveDivision(24, 2));
        assertEquals(2, RecursionMath.recursiveDivision(4, 2));
        
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	  assertEquals(8, RecursionMath.recursivePower(2, 3));
    	  assertEquals(100, RecursionMath.recursivePower(10, 2));
    	  assertEquals(64, RecursionMath.recursivePower(8, 2));
    }
}
