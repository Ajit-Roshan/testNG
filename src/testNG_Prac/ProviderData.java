package testNG_Prac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProviderData {

	@Test (dataProvider = "dataSet")
	public void test_a(String uName , String uAddress) {
		System.out.println(uName +" --- "+uAddress);
	}		
	
	
	@DataProvider (name = "dataSet")
	public Object [][] datas(){
		return new Object[][] {
			{"ajit" , "ranchi"},
			{"ashishan" , "khunti"},
			{"sapna" , "dhanbad"},	
			{"alice","noamundi"}
		};		
	}	
}
