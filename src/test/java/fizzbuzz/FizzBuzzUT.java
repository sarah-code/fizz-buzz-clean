package fizzbuzz;

import static fizzbuzz.FizzBuzz.modulo3;
import static fizzbuzz.FizzBuzz.modulo5;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UT")
@Tag("fast")
public class FizzBuzzUT {

	@Test
	@DisplayName("module3 returns true if 3 mod 3 is 0")
	public void module3ReturnsTrueIf3mod3is0() {
		assertTrue(modulo3(3));
	}
	
	@Test
	@DisplayName("module3 returns false if 4 mod 3 is 1")
	public void module3ReturnsTrueIf4mod3is1() {
		assertFalse(modulo3(4));
	}
	
	@Test
	@DisplayName("module5 returns true if 5 mod 5 is 0")
	public void module3ReturnsTrueIf5mod5is0() {
		assertTrue(modulo5(5));
	}
	
	@Test
	@DisplayName("module3 returns false if 6 mod 5 is 1")
	public void module3ReturnsTrueIf6mod5is1() {
		assertFalse(modulo5(6));
	}
	
	@Test
	@DisplayName("fizz is returned when 3 is0WhenModulo3")
	public void fizzisReturnedWhen3Is0WhenModulo3() {
		assertEquals("fizz", FizzBuzz.is0WhenModulo3(3));
	}
	
	@Test
	@DisplayName("number 4 is returned when 4 is0WhenModulo3")
	public void number4isReturnedWhenIs0WhenModulo3() {
		assertEquals("4", FizzBuzz.is0WhenModulo3(4));
	}
	
	@Test
	@DisplayName("buzz is returned when 5 is0WhenModulo5")
	public void buzzisReturnedWhen5Is0WhenModulo5() {
		assertEquals("buzz", FizzBuzz.is0WhenModulo5(5));
	}
	
	@Test
	@DisplayName("number 7 is returned when 7 is0WhenModulo5")
	public void number7isReturnedWhen7Is0WhenModulo5() {
		assertEquals("7", FizzBuzz.is0WhenModulo5(7));
	}
	
	@Test
	@DisplayName("fizz buzz is returned when 15 is0WhenModulo3And5")
	public void fizzbuzzisReturnedWhen5Is0WhenModulo3And5() {
		assertEquals("fizz buzz", FizzBuzz.is0WhenModulo3And5(15));
	}
	
	@Test
	@DisplayName("buzz is returned when 5 is0WhenModulo5")
	public void buzzisReturnedWhen5Is0WhenModulo3And5() {
		assertEquals("buzz", FizzBuzz.is0WhenModulo3And5(5));
	}
	
	@Test
	@DisplayName("buzz is returned when 3 is0WhenModulo5")
	public void buzzisReturnedWhen3Is0WhenModulo3And5() {
		assertEquals("buzz", FizzBuzz.is0WhenModulo3And5(5));
	}
	
	@Test
	@DisplayName("Testing fizzBuzz As Whole")
	void testingFizzBuzzAsWhole() {
		 ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	      System.setOut(new PrintStream(outContent));
	     FizzBuzz.main(new String[3]);
	     String partOfOutput  = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n";
	     assertTrue( outContent.toString().contains(partOfOutput));
	}
	

}
