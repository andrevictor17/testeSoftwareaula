package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class CelulaTest {
	
	private Celula c1=mock(Celula.class);
	private Celula c2=mock(Celula.class);
	private Celula c3=mock(Celula.class);
	
	@Before
	public void setUp()
	{
		when(c1.getNome()).thenReturn("celula 1");
		when(c2.getNome()).thenReturn("celula 2");
		when(c3.getNome()).thenReturn("celula 3");
		
		when(c1.getProxima()).thenReturn(c2);
		when(c1.getAnterior()).thenReturn(null);
		when(c2.getProxima()).thenReturn(c3);
		when(c2.getAnterior()).thenReturn(c1);
		when(c3.getProxima()).thenReturn(null);
		when(c3.getAnterior()).thenReturn(c2);
	}
	@Test
	public void test1() {
		assertTrue(c1.getNome()=="celula 1");
		
	}
	public void test2() {
		assertTrue(c2.getNome()=="celula 2");
		
	}
	public void test3() {
		assertTrue(c3.getNome()=="celula 3");
	}
	public void test4() {
		assertTrue(c1.getProxima()==c2);
	}
	public void test5() {
		assertNull(c1.getAnterior());
	}
	public void test6() {
		assertTrue(c2.getProxima()==c3);
	}
	public void test7() {
		assertTrue(c2.getAnterior()==c1);
	}
	public void test8() {
		assertNull(c3.getProxima());
	}
	public void test9() {
		assertTrue(c3.getAnterior()==c2);
	}

}
