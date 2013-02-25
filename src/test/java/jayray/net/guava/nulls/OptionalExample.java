package jayray.net.guava.nulls;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.base.Optional;

public class OptionalExample {

	@Test
	public void useOptionalWithProvidedPrimativeValue() {
		int myValue = 5;

		Optional<Integer> possible = Optional.fromNullable(myValue);
		assertTrue(possible.isPresent());
		assertTrue(5 == possible.get());
	}

	@Test
	public void useOptionalWithProvidedObjectValue() {
		Integer myValue = new Integer(5);

		Optional<Integer> possible = Optional.fromNullable(myValue);
		assertTrue(possible.isPresent());
		assertTrue(5 == possible.get());
	}

	@Test
	public void useOptionalWithProvidedObjectAsNull() {
		Integer myValue = null;

		Optional<Integer> possible = Optional.fromNullable(myValue);
		assertFalse(possible.isPresent());
	}

}
