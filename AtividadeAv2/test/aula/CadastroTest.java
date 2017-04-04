//// Implementing the exercise test 02 (Class Cadastre)
package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.io.IOException;
public class CadastroTest {
	
	Cadastro k=mock(Cadastro.class);
	@Before
	public void setUp() throws IOException
	{
		when(k.insert(1, "De volta para o futuro I")).thenReturn(true);
		when(k.insert(2, null)).thenThrow(NullPointerException.class);
		when(k.insert(3, "")).thenThrow(IOException.class);
	
		
	}
	//Test later A
	
	@Test 
	public void test1() throws IOException {
		assertTrue(k.insert(1, "De volta para o futuro I"));
	}
	
	@Test(expected=NullPointerException.class)
	public void test2() throws IOException {
		assertTrue(k.insert(2, null));
	}
	
	@Test(expected=IOException.class)
	public void test3() throws IOException {
		assertTrue(k.insert(3, ""));
	}
	
	//Test later B	
	@Test(expected=IOException.class)
	public void test4() throws IOException {
		Cadastro kad=new Cadastro("");
		kad.imprimir();
	}
	

}
