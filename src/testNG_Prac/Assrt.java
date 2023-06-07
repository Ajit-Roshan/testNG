package testNG_Prac;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Assrt  {
	
	static int a = 10;
	
	static String name1= "ajit";
	static String name11= "ajit";
	
	static String name2= "roshan";
	
	
	@Test
	public void one() {
		
	System.out.println("starting test one start ");
	
//	assertEquals(name1 , name2);
//	assertNotEquals(name2, name1);
	
//   Assert.assertEquals(true, name11 == name1);
//	assertEquals(true, name11 == name1);
	
//	SoftAssert sas= new SoftAssert();	
//	sas.assertEquals(false, name11 == name1);
//	sas.assertAll();
	
	
	assertFalse(false, "asseert true and boolean is false");
	

	System.out.println("starting test one end");
	
	
		
	}

}