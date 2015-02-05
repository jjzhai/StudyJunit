package calculator;
import junit.framework.TestCase;

public class TestCalculator2 extends TestCase {
	public void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(1,2);
		assertEquals(3,result,0);
		System.out.println("2");
	}
}
