package jayray.net.guava.nulls;

import org.junit.Test;

import com.google.common.base.Optional;

@SuppressWarnings("unused")
public class OptionalPerformanceTest {
	private final int numberOfIterations = 100000000;

	@Test
	public void nativePrimativeAssignment() {
		for (int i = 0; i < numberOfIterations; i++) {
			int x = i;
			int y = x;
		}
	}

	@Test
	public void nativeIntegerAssignment() {
		for (int i = 0; i < numberOfIterations; i++) {
			Integer x = i;
			Integer y = x;
		}
	}

	@Test
	public void ofAssignment() {
		for (int i = 0; i < numberOfIterations; i++) {
			Optional<Integer> x = Optional.of(i);
			Integer y = x.get();
		}
	}

	@Test
	public void fromNullableAssignment() {
		for (int i = 0; i < numberOfIterations; i++) {
			Optional<Integer> x = Optional.fromNullable(i);
			Integer y = x.get();
		}
	}
}
