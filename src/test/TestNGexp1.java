package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGexp1 {
	
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");

	}
	
	@BeforeTest
	public void Music()
	{
		System.out.println("The Music is good");
	}
	
	@Test
	public void draw()
	{
		System.out.println("The Drawing is good");
	}
	
	@BeforeMethod
	public void everymethod()
	{
		System.out.println("print before every method of TestNGexp1");
	}
	
	@AfterSuite
	public void Gohome()
	{
		System.out.println("The last one");
	
	}

}
