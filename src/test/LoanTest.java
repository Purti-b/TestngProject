package test;

import org.testng.annotations.Test;

@Test (groups= {"regression"}) //all the method of this class will become test and will come under regression group
public class LoanTest extends BaseClass{
	
	@Test(priority=2)
	public void HomeLoanTest() {
		System.out.println("Inside Home Loan Test");
	}
	
	@Test(enabled = false, priority=1)
	public void PersonalLoanTest() {
		System.out.println("Inside Personal Loan Test");
	}
	
	@Test(groups= {"sanity"}, description = "this is CC test", priority=0) //test case with no priority mentioned will be executed first
	public void PersonalLoanTest1() {
		System.out.println("Inside Personal Loan Test1");
	}

}
