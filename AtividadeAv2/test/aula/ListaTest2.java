
package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class ListaTest2 {
	private Lista list=mock(Lista.class);
	
	@Before
	public void setUp()
	{
		when(list.get(anyInt()))
		.thenReturn("aaa")
		.thenReturn("bbb")
		.thenThrow(ArrayIndexOutOfBoundsException.class);
	}
	
	
	@Test
	public void test1() {
		assertTrue(list.get(0)=="aaa");
	}
	
	@Test
	public void test2() {
		list.get(0);
		assertTrue(list.get(1)=="bbb");
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test3() {
		list.get(0);
		list.get(1);
		list.get(2);
	}

}
