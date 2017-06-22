package JavaValidateSum1.validateSum1;

import org.junit.Test;

import junit.framework.TestCase;

public class GetSumTest extends TestCase {
	
	@Test
	public void test1(){
		
		ArithmaticCalculation Sum= new ArithmaticCalculation();
		
		assertEquals (Sum.getSum(2, 3),5) ;
		
	}
	
	@Test
	public void test2(){
		
		ArithmaticCalculation dif= new ArithmaticCalculation();
		
		assertEquals (dif.getDiff(3, 2),5) ;
		
	}
	
	

}
