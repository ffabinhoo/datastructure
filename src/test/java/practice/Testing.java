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
	    Optional<String> str = Optional.of("testing");
	    assertTrue(str.isPresent());
	}
	
	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("testing");
	    opt.ifPresent(name -> System.out.println(name.length()));
	}
	
	@Test
	public void whenOrElseWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("testing");
	    assertEquals("testing", name);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenOrElseThrowWorks_thenCorrect() {
	    String nullName = null;
	    Optional.ofNullable(nullName).orElseThrow(
	      IllegalArgumentException::new);
	}
	
	@Test
	public void givenOptional_whenGetsValue_thenCorrect() {
	    Optional<String> opt = Optional.of("testing");
	    String name = opt.get();
	    assertEquals("testing", name);
	}
	
	

}
