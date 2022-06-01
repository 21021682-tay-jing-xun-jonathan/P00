import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
		//fail("Not yet implemented");
	//test case for addition	
	public void testAdd() {
			int a = 4321;
			int b = 1234;
				
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 
				 
			int expected = 5555;
			assertEquals (expected, actual);
			}
	@Test
	//test case for subtract
	public void testsubtract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		}
	@Test
	//test case for multiply
	public void testmultiply() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 5332114;
		assertEquals (expected, actual);
		}
	@Test
	//test case for divide
	public void testdivide() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 3;
		assertEquals (expected, actual);
		}
}
	


