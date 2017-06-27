package JavaValidateSum1.validateSum1;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class GetSumTest extends TestCase {
	
	@Test
	public void test1(){
		
		ArithmaticCalculation sum= new ArithmaticCalculation();
		int sumValue = sum.getSum(2, 3);
		Assert.assertEquals (sumValue,5) ;
		
	}
	
	@Test
	public void test2(){
		
		ArithmaticCalculation dif= new ArithmaticCalculation();
		
		Assert.assertEquals (dif.getDiff(3, 2),1) ;
		
	}
	
	

}
