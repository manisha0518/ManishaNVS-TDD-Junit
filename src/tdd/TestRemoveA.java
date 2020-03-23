package tdd;
import org.junit.*;
import static org.junit.Assert.*;

public class TestRemoveA {
	TDDTest tddTest;
	
	@Before
	public void setUp() {
		tddTest = new TDDTest();
	}
	
	@Test
	public void testEmptyString() {
		assertEquals("", tddTest.removeA(""));
	}
	
	@Test
	public void testSingleA() {
		assertEquals("", tddTest.removeA("A"));
	}
	
	@Test
	public void testDoubleA() {
		assertEquals("", tddTest.removeA("AA"));
	}
	
	@Test
	public void testSingleNonA() {
		assertEquals("D", tddTest.removeA("D"));
	}
	
	@Test
	public void testDoubleNonA() {
		assertEquals("CD", tddTest.removeA("CD"));
	}
	
	@Test
	public void testNoneAString() {
		assertEquals("BFGSDR", tddTest.removeA("BFGSDR"));
	}
	
	@Test
	public void testSingleAPostion1() {
		assertEquals("BDFAR", tddTest.removeA("ABDFAR"));
	}
	
	@Test
	public void testSingleAPostion2() {
		assertEquals("BDFARA", tddTest.removeA("BADFARA"));
	}
	
	@Test
	public void testDoubleAString() {
		assertEquals("BDAFARA", tddTest.removeA("AABDAFARA"));
	}
}
