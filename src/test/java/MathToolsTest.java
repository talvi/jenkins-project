import junit.framework.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.edu.MathTools;


public class MathToolsTest {

	@DataProvider
	public Object[][] data(){
		return new Object[][]{
				{1, 2},
				{5, 6},
				{3.4, 9.33},
				{76.23, 67.12},
				{4574.76, 89.2}
		};		
	}
	
	@Test( dataProvider = "data" )
	public void testSum(double a, double b){
		double result = MathTools.sum(a, b);
		double expected = a + b;
		Assert.assertTrue("Wrong result! Incoming numbers: " + a + " " + b + " Result: " + result + " Instead of: " + expected, result == expected);
	}
	
}
