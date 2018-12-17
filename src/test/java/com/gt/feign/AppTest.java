package com.gt.feign;

import java.util.List;

import com.gt.feign.client.BulloneFeignController;
import com.gt.feign.client.Resource.BulloneResource;
import com.gt.feign.dto.Bullone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testFindById() {
		BulloneFeignController bulloneFeignController = new BulloneFeignController();

		Bullone bullone = bulloneFeignController.findById(9L);
		assertTrue(bullone != null);
		
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testFindAll(){
		BulloneFeignController bulloneFeignController = new BulloneFeignController();
		
		List<BulloneResource> lista = bulloneFeignController.findAll();
		for (BulloneResource bulloneResource : lista) {
			assertTrue(bulloneResource.getBullone() != null);
		}
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testCreate() {
		BulloneFeignController bulloneFeignController = new BulloneFeignController();

		bulloneFeignController.create(new Bullone(88L));
		assertTrue(true);
	}
}
