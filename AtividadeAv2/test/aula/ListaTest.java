
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
		when(list.get(0)).thenReturn("Andre");
		when(list.get(1)).thenReturn("Gabriel");
		when(list.get(2)).thenReturn("Jullyana");
		when(list.get(3)).thenThrow(ArrayIndexOutOfBoundsException.class);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test1() {
		list.add("Andre");
		list.add("Gabriel");
		list.add("Jullyana");
		list.get(3);
	}
	@Test
	public void test2() {
		list.add("Andre");
		assertTrue(list.get(0)=="Andre");
		
		
	}
	public void test3() {
		list.add("Andre");
		list.add("Gabriel");
		assertTrue(list.get(1)=="Gabriel");
		
	}
	public void test4() {
		list.add("Andre");
		list.add("Gabriel");
		list.add("Jullyana");
		assertTrue(list.get(2)=="Jullyana");
		
	}

}
