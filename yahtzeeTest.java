import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class yahtzeeTest {

	@Test
	void test() {
		int actual = Yahtzee.yahtzee(new int[] {1, 6, 5, 5, 2}, "ones");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void test2s() {
		int actual = Yahtzee.yahtzee(new int[] {1, 6, 5, 5, 2}, "twos");
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	void testpairs() {
		int actual = Yahtzee.yahtzee(new int[] {3, 3, 3, 4, 4}, "pairs");
		int expected = 8;
		assertEquals(expected, actual);
	}
	
	@Test
	void test2pairs() {
		int actual = Yahtzee.yahtzee(new int[] {1, 3, 3, 4, 4}, "twopairs");
		int expected = 14;
		assertEquals(expected, actual);
	}
	
	@Test
	void test2pairs2() {
		int actual = Yahtzee.yahtzee(new int[] {3, 3, 3, 4, 4}, "twopairs");
		int expected = 14;
		assertEquals(expected, actual);
	}
	
	@Test
	void test3kind() {
		int actual = Yahtzee.yahtzee(new int[] {3, 3, 3, 4, 4}, "threeEquals");
		int expected = 9;
		assertEquals(expected, actual);
	}
	
	@Test
	void test4kind() {
		int actual = Yahtzee.yahtzee(new int[] {2,2,2,2,5}, "fourEquals");
		int expected = 8;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSmall() {
		int actual = Yahtzee.yahtzee(new int[] {1,2,3,4,5}, "smallStraight");
		int expected = 15;
		assertEquals(expected, actual);
	}
	
	@Test
	void testLarge() {
		int actual = Yahtzee.yahtzee(new int[] {1,2,3,4,5}, "largeStraight");
		int expected = 20;
		assertEquals(expected, actual);
	}
	
	@Test
	void testFull1() {
		int actual = Yahtzee.yahtzee(new int[] {3,3,4,4,4}, "fullhouse");
		int expected = 18;
		assertEquals(expected, actual);
	}
	
	@Test
	void testFull2() {
		int actual = Yahtzee.yahtzee(new int[] {3,3,3,3,3}, "fullhouse");
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	void testYahtzee() {
		int actual = Yahtzee.yahtzee(new int[] {3,3,3,3,3}, "yahtzee");
		int expected = 50;
		assertEquals(expected, actual);
	}
	
	@Test
	void testChance() {
		int actual = Yahtzee.yahtzee(new int[] {3,4,6,2,1}, "chance");
		int expected = 16;
		assertEquals(expected, actual);
	}
}
