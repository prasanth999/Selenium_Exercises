package week4day1;

import org.testng.annotations.Test;

public class DepandOnMethod {
	
	@Test(invocationCount=2)
	public void createLead()
	{
		System.out.println("Create Lead");
	}
	
	@Test(dependsOnMethods= {"week4day1.DepandOnMethod.CreateLead"})
	public void editLead()
	{
		System.out.println("Create Lead");
	}
	
	@Test(enabled=false)
	public void deleteLead()
	{
		System.out.println("Create Lead");
	}
	
	}

