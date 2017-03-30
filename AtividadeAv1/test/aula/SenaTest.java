package aula;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class SenaTest {

	Sena sn;
	
	// Exercicio 1 - a
	
	@Test (expected = Exception.class)
	public void testConst1() throws Exception{
		sn = new Sena(5);
		assertNull(sn);
	}
	
	@Test
	public void testConst2() throws Exception{
		sn = new Sena(6);
		assertNotNull(sn);
	}
	
	@Test
	public void testConst3() throws Exception{
		sn = new Sena(11);
		assertNotNull(sn);
	}
	
	@Test
	public void testConst4() throws Exception{
		sn = new Sena(12);
		assertNotNull(sn);
	}
	
	@Test (expected = Exception.class)
	public void testConst5() throws Exception{
		sn = new Sena(13);
		assertNull(sn);
	}
	
	
	// Exercicio 1 - b
	
	@Test
	public void verificaIntervalo() throws Exception{
		sn = new Sena(8);		
		boolean condicao = false;
		
		//System.out.println(sn);		

		if(sn.hasNro(61) == true){
			condicao = true;				
		}
			
		assertFalse(condicao);	
	}
	
	
	//Exercicio 1 - c
	@Test
	public void verificaOrdenacao() throws Exception{
		sn = new Sena(8);

		String num = sn.toString();
		String[] v = num.split(";");	
		
		int atual = Integer.parseInt(v[0]);
		
		//numeros estão ordenados = true
		boolean condicao = true;
		
		//System.out.println(num);
		
		for(int i = 1; i<8; i++){
			if(Integer.parseInt(v[i]) >= atual ){
				atual = Integer.parseInt(v[i]);
				//System.out.println(atual);
			}
			else
			{
				//Numeros desordenados = false
				condicao = false;
				break;
			}
		}
		
		assertTrue(condicao);
	}
	
	
	//Exercicio 1 - d
	@Test
	public void verificaNumRepetidos() throws Exception{
		
		sn = new Sena(8);
		
		String num = sn.toString();
		String[] v = num.split(";");
		
		//System.out.println(num);
		
		int atual = Integer.parseInt(v[0]);
		
		// numeros repetidos = false
		boolean condicao = false;
		
		for(int i=1; i<8; i++){
			if(Integer.parseInt(v[i]) == atual){			
				condicao = true;
				break;
			}
			else
			{
				atual = Integer.parseInt(v[i]);
			}
		}
		
		assertTrue(condicao);		
	}
	
	
	
}

