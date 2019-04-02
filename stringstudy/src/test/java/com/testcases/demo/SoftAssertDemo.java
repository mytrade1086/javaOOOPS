package com.testcases.demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test(enabled = false)
	public void demoNormalAssert() {

		System.out.println("forcefully ");
		Assert.assertEquals(false, true);

		System.out.println("valid Condition");
		Assert.assertEquals(true, true);

		/*
		 * # Never goes after first assertion is failure forcefully FAILED:
		 * demoSoftAssert java.lang.AssertionError: expected [true] but found [false]
		 */

		/*
		 * Default test Tests run: 1, Failures: 1, Skips: 0
		 */

	}

	@Test(enabled = false)
	public void demoFormalAsssert() {

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(true, true);
		System.out.println("Passed case ");

		softAssert.assertEquals(false, true);
		System.out.println("forcefully ");

		/*
		 * # We haven't used Assert.aseertall at a a line line hence only passed data
		 * shown Passed case forcefully PASSED: demoFormalAsssert
		 * =============================================== Default test Tests run: 1,
		 * Failures: 0, Skips: 0 =============================================== Default
		 * suite Total tests run: 1, Failures: 0, Skips: 0
		 * ===============================================
		 */

	}

	@Test
	public void demoSoftAssert_withAssertAll() {
		
		Date d=new Date();
		
		System.out.println("demoSoftAssert_withAssertAll test started on "+d);
		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(true, true);
		System.out.println("Passed case ");

		softAssert.assertEquals(false, true);
		System.out.println("forcefully ");

		softAssert.assertAll();

		/*
		 * Passed case forcefully FAILED: demoSoftAssert_withAssertAll
		 * java.lang.AssertionError: The following asserts failed: expected [true] but
		 * found [false]
		 * 
		 * 
		 * 
		 * 
		 * =============================================== Default test Tests run: 1,
		 * Failures: 1, Skips: 0 ===============================================
		 * 
		 * 
		 * =============================================== Default suite Total tests
		 * run: 1, Failures: 1, Skips: 0 ===============================================
		 */

	}
}