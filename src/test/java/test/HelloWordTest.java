package test;
import junit.framework.Assert;

import org.junit.Test;

import principal.HelloWord;


public class HelloWordTest {

	@Test
	public void testSayHello() {
		String result = HelloWord.sayHello("Paul");
		System.out.println(result);
		Assert.assertEquals("Paul", result);
		

	}
}
