package practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

public class Testing {
	
	
	@Test
	public void test() {
		assertEquals(0, 2/3);
	}
	
	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
	    Optional<String> empty = Optional.empty();
	    assertFalse(empty.isPresent());
	}
	
	@Test
	public void whenCreatesOptional_thenCorrect() {
	    Optional<String> str = Optional.of("String");
	    assertTrue(str.isPresent());
	}

}
