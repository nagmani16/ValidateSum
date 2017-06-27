package calculationTest;

import org.junit.Test;

import calculation.ArithmaticCalculation;
import junit.framework.Assert;
public class GetSumTest{
	
	@Test
	public void test1(){
		
		
		ArithmaticCalculation sum= new ArithmaticCalculation();
		int sumValue = sum.getSum(2, 3);
		Assert.assertEquals (5,sumValue) ;
	
		
	}
	
	@Test
	public void test2(){
		
		ArithmaticCalculation dif= new ArithmaticCalculation();
		int difValue= dif.getDiff(3, 2);
	
		Assert.assertEquals (1,difValue) ;
		
	}
	
	

}
