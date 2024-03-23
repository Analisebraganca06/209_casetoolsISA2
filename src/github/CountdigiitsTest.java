package github;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountdigiitsTest {
	static Countdigiits_209 amt;
	static Countdigiits_209 amt2;
	int num1;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		amt=new Countdigiits_209(600);
		amt2=new Countdigiits_209(60);
		
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
	public void test() {
		int countd;
		countd=amt.getcount();
		assertEquals(3,countd);
	}
	public void test2() {
		int countd;
		countd=amt2.getcount();
		assertEquals(2,countd);
	}

}
