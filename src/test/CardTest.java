package test;

import org.testng.annotations.Test;

public class CardTest extends BaseClass{

	@Test (groups= {"sanity"},enabled=false)
	public void CCTest() {
		System.out.println("Inside CC Test");
	}
}
