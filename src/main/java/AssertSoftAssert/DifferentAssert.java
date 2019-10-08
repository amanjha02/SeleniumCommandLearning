package AssertSoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DifferentAssert {
	SoftAssert sass=new SoftAssert();
	
	@Test
	public void Test1() {
		System.out.println("Test1");
		sass.assertEquals(false, true);
		
		System.out.println("Test1");
		System.out.println("Test1");
		System.out.println("Test1");
		sass.assertAll();
		
	}

}
