package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FilaTest {

	Fila fl;
	Celula cl;
	
	@Before
	public void setUp(){
		fl = new Fila();
	}
	
	
	//Teste metodo add
	@Test // 
	public void testeAdd1() throws Exception{			
		fl.add("Maria");		
		assertNotNull(fl);
	}	
	
	@Test
	public void testeAdd2() throws Exception{			
		fl.add("Maria");	
		fl.add("Joao");
		assertNotNull(fl);		
	}
	
	@Test(expected=Exception.class)
	public void testeAdd3() throws Exception{			
		fl.add("");
		assertNull(fl);	
	}
	
	@Test(expected=Exception.class)
	public void testeAdd4() throws Exception{			
		fl.add(null);
		assertNull(fl);	
	}
	
	//Teste metodo remover
	
	@Test
	public void testRemover1() throws Exception{
		fl.add("Maria");
		assertEquals("Maria",fl.remover());		
	}
	
	@Test
	public void testRemover2() throws Exception{
		fl.add("Maria");	
		fl.add("Joao");		
		assertEquals("Maria", fl.remover());		
	}
	
	@Test
	public void testRemover3() throws Exception{
		fl.add("Maria");
		fl.add("Joao");
		fl.remover();
		assertEquals("Joao",fl.remover());		
	}
	
	@Test(expected=Exception.class)
	public void testRemover4() throws Exception{
		fl.add("");		
		assertNull(fl.remover());		
	}
		
	@Test(expected=Exception.class)
	public void testRemover5() throws Exception{
		fl.add(null);		
		assertNull(fl.remover());		
	}
	
	
	//Teste final
	
	@Test
	public void testeFinal1() throws Exception{			
		fl.add("Maria");	
		fl.add("Joao");
		assertEquals("Joao", fl.getFinal());		
	}
	
	@Test
	public void testeFinal2() throws Exception{			
		fl.add("Maria");	
		fl.add("Joao");
		fl.add("Pedro");
		assertEquals("Pedro", fl.getFinal());		
	}
	
	@Test(expected=Exception.class)
	public void testeFinal3() throws Exception{			
		fl.add("");		
		assertNull(fl.getFinal());		
	}
	
	@Test(expected=Exception.class)
	public void testeFinal4() throws Exception{			
		fl.add(null);		
		assertNull(fl.getFinal());		
	}		
	

}

