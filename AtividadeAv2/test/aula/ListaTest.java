
package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class ListaTest {
	private Lista list=mock(Lista.class);
	
	@Before
	public void setUp()
	{
		when(list.get(0)).thenReturn("Mauricio");
		when(list.get(1)).thenReturn("Thiago");
		when(list.get(2)).thenReturn("João Pedro");
		when(list.get(3)).thenThrow(ArrayIndexOutOfBoundsException.class);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test1() {
		list.add("Mauricio");
		list.add("Thiago");
		list.add("João Pedro");
		list.get(3);
	}
	@Test
	public void test2() {
		list.add("Mauricio");
		assertTrue(list.get(0)=="Mauricio");
		
		
	}
	public void test3() {
		list.add("Mauricio");
		list.add("Thiago");
		assertTrue(list.get(1)=="Thiago");
		
	}
	public void test4() {
		list.add("Mauricio");
		list.add("Thiago");
		list.add("João Pedro");
		assertTrue(list.get(2)=="João Pedro");
		
	}

}
