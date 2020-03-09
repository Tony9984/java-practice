package arrays;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ArrayListTests {

	@Test()
	public void testAdd() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		assertTrue(1 == test.get(0));
        assertTrue(2 == test.get(1));
        assertTrue(3 == test.get(2));
	}
	
	@Test()
	public void testArrayResize() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
        assertTrue(11 == test.get(10));
	}
	
	@Test()
	public void testRemove() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		test.remove(2);
        assertTrue(10 == test.size());
        assertTrue(4 == test.get(2));
	}
	
	@Test()
	public void testEmpty() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		assertTrue(true == test.isEmpty());
	}
	
	@Test()
	public void testSize() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		test.add(12);
		assertTrue(12 == test.size());
	}
	
}
