package com.webtrixs.healthcheck.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.webtrixs.healthcheck.model.HealthCheck;

public class HealthCheckControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHealthCheck() {
		HealthCheckController hcc = new HealthCheckController();
		List<HealthCheck> hcList = 	hcc.getHealthCheck();
		assertEquals(2, hcList.size());
		System.out.println(hcList.size());
		
	}

}
