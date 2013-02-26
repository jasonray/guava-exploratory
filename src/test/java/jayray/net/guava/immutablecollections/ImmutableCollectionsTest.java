package jayray.net.guava.immutablecollections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class ImmutableCollectionsTest {

	@Test
	public void accessCollection() {
		ImmutableList<String> strings = ImmutableList.copyOf(getStrings());
		assertEquals(3, strings.size());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void addStuffToCollection() {
		ImmutableList<String> strings = ImmutableList.copyOf(getStrings());
		strings.add("dates");
	}

	private Collection<String> getStrings() {
		List<String> l = new ArrayList<String>();
		l.add("apple");
		l.add("banana");
		l.add("coconut");
		return l;
	}

}
