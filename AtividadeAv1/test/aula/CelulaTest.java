package aula;

import static org.junit.Assert.*;

import org.junit.Test;

public class CelulaTest {
	
	Celula cl;	
	

	@Test //new Celula("Ana")
	public void construtor1() throws Exception {
		cl = new Celula("Ana");
		assertEquals("Ana", cl.getNome());
	}
	
	@Test(expected=Exception.class) //new Celula("")
	public void construtor2() throws Exception {
		cl = new Celula("");
		assertEquals("", cl.getNome());
	}
	
	@Test(expected=Exception.class) //new Celula(null)
	public void construtor3() throws Exception {
		cl = new Celula(null);
		assertEquals(null, cl.getNome());
	}	

}
