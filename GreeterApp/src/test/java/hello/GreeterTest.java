package hello;

import org.junit.Test;

public class GreeterTest {

	private Greeter greeter = new Greeter();

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Hello"));
	}

	private void assertThat(String sayHello, Object containsString) {
		// TODO Auto-generated method stub
		
	}

	private Object containsString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
