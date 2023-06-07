package newNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class One {
	
	int a;
	
//	@Parameters("egg")
	@BeforeMethod(groups = "b/a")
	public void before() {
		System.out.println("before method and receive ");
		a = 10;
	}
	
	@AfterMethod(groups = "b/a")
	public void after() {
		System.out.println("after method");
	}
	
	@Test(dataProvider = "data" , groups = "data")
	public void test1(String data) {
		System.out.println("data method "+data );
	}
	
	@DataProvider(name = "data")
	public Object[][] dataHolder(){
		return new Object[][] {
			{"name"},{"ajit"},{"roshan"},{"soy"}
		};
	}
	
	
	@Test(groups = "even")
	public void test2() {
		System.out.println("test2 method");
	}
	
	@Test(groups = "odd" , priority = 2)
	public void test3() {
		System.out.println("test3 method");
	}
	
	@Test(groups = "even")
	public void test4() {
		System.out.println("test4 method");
	}
	
	@Test(groups = "odd" , priority = 1)
	public void test5() {
		System.out.println("test5 method");
		System.out.println("odd no. is "+a);
	}
	
	@Test(groups = "even")
	public void test6() {
		System.out.println("test6 method");
	}
	
}
