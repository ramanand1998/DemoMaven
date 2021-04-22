package ramanand.DemoMaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testGreet()
	{
		String res = Hello.greet("world");
		assertEquals(res,"Hello world");
	}

}
