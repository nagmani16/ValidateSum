package JavaValidateSum1.validateSum1;

import org.junit.Test;

import junit.framework.TestCase;

public class GetSumTest extends TestCase {
	
	@Test
	public void test1(){
		
		GetSum sum1= new GetSum();
		
		assertEquals (sum1.getSum(2, 3),5) ;
		
	}
	

}
