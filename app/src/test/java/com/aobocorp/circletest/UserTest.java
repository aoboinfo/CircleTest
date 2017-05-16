package com.aobocorp.circletest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shutoukin on 2017/05/16.
 */
public class UserTest {
	User testUser = null;
	@Before
	public void setUp() throws Exception {
		testUser = new User();
		testUser.setAge(18);
	}

	@After
	public void tearDown() throws Exception {
		testUser = null;
	}

	@Test
	public void getName() throws Exception {
		testUser.setName("Wang");
		assertEquals("Wang is OK", "Wang", testUser.getName());
	}

	@Test
	public void setName() throws Exception {
		testUser.setName("Li");
		assertEquals("Li is OK", "Li", testUser.getName());
	}

	@Test
	public void getAge() throws Exception {
		testUser.setAge(18);
		assertEquals(18, testUser.getAge(), 0.0);
	}

	@Test
	public void setAge() throws Exception {
		testUser.setAge(16);
		assertEquals(16, testUser.getAge(), 0.0);
	}

	@Test
	public void isMale() throws Exception {
		assertFalse(testUser.isMale());
	}

	@Test
	public void setMale() throws Exception {
		testUser.setMale(true);
		assertTrue(testUser.isMale());
	}

	@Test
	public void isAdult() throws Exception {
		assertTrue(testUser.isAdult());
	}

}