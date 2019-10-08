package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizeEx {
	@Test
	@Parameters({"FirstName","LastName"})
	public void getDataFromExcel(String FirstName,String LastName ) {
		System.out.println(FirstName+"      "+LastName);
	}

}
