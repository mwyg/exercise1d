package wdsr.exercise1.logic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import wdsr.exercise1.conversions.ArrayConverter;

public class ArrayConverterTest {

	ArrayConverter converter;

	@Before
	public void setup() {
		converter = new ArrayConverter();
	}

	@Test
	public void testConvertToInts_shouldReturnProperArrayOfIntegers() {
		// given
		String[] input = { "-1", "-0", "3" };

		// when
		int[] result = converter.convertToInts(input);

		int[] expected = { -1, 0, 3 };

		// then
		assertArrayEquals(expected, result);
	}

	@Test
	public void testConvertToInts_shouldReturnEmptyList() {
		// given
		String[] input = {};

		// when
		int[] result = converter.convertToInts(input);

		// then
		assertEquals(0, result.length);
	}

	@Test(expected = NullPointerException.class)
	public void testConvertToInts_shouldRaiseAnExceptionWhenInputIsNull() {
		// given
		String[] input = null;

		// when
		int[] result = converter.convertToInts(input);

		// then
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertToInts_shouldRaiseAnExceptionWhenFormatOfNumberIsWrong() {
		// given
		String[] input = { "1", "1a" };

		// when
		int[] result = converter.convertToInts(input);

		// then
	}
}
