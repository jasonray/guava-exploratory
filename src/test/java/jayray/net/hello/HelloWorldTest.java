package jayray.net.hello;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void runHelloWithoutError() {
		HelloWorld subject = new HelloWorld();
		subject.sayhello();
	}

}
