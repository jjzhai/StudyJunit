package prime;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class check4PrimeTest extends TestCase{
	private check4Prime check4prime = new check4Prime();
	
	public check4PrimeTest (String name){
		super(name);
	}
	
	public static void main(String[] args){
		System.out.println("Starting test...");
		junit.textui.TestRunner.run(suite());
		System.out.println("Test finished...");
	}
	
	//testcase 1
	public void testCheckPrime_true() {
		assertTrue(check4prime.primeCheck(3));
	}
	//testcase 2 3
	public void testCheckPrime_false(){
		assertFalse(check4prime.primeCheck(0));
		assertFalse(check4prime.primeCheck(1000));
	}
	//testcase 6
	public void testCheck4Prime_checkArgs_char_input(){
		try {
			String [] args=new String[1];
			args[0]="r";
			check4prime.checkArgs(args);
			fail("Should raise an Exception.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//tetcase 5
	public void testCheck4Prime_checkArgs_above_upper_bound(){
		try {
			String [] args=new String[1];
			args[0]="10001";
			check4prime.checkArgs(args);
			fail("Should raise an Exception.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//tetcase 4
	public void testCheck4Prime_checkArgs_neg_input(){
		try {
			String [] args=new String[1];
			args[0]="-1";
			check4prime.checkArgs(args);
			fail("Should raise an Exception.");
		} catch (Exception e) {
			// 	TODO: handle exception
		}
	}
		
	//tetcase 7
	public void testCheck4Prime_checkArgs_2_inputs(){
		try {
			String [] args=new String[2];
			args[0]="5";
			args[1]="99";
			check4prime.checkArgs(args);
			fail("Should raise an Exception.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//tetcase 8
	public void testCheck4Prime_checkArgs_0_inputs(){
		try {
			String [] args=new String[0];
			check4prime.checkArgs(args);
			fail("Should raise an Exception.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Test suite() {
		TestSuite suite=new TestSuite(check4PrimeTest.class);
		return suite;
	}
}
