package yury.abramovich.gitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class sumTest {

	@Test
	@DisplayName("test 3")
	void test3() {

		assertEquals(9, HelloWorldHelp.squad(3));

	}
	
	@Test
	@DisplayName("test 5")
	void test5() {
		assertEquals(25, HelloWorldHelp.squad(5));
	}

}
