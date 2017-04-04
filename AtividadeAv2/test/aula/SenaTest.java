package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
public class SenaTest {
	
	private Sena sena=mock(Sena.class);
	
	@Before
	public void setUp()
	{
		when(sena.create(5)).thenThrow(new NullPointerException());
		when(sena.create(6)).thenReturn(new int[]{1,6,8,19,56,60});
		when(sena.create(12)).thenReturn(new int[]{1,6,10,14,17,19,24,36,47,57,59,60});
		when(sena.create(13)).thenThrow(new NullPointerException());
	}
	
	// n < 6 - exe 1a
	@Test(expected=NullPointerException.class)
	public void test1() {
		sena.create(5);
	}
	
	// n > 12 - exe 1a
	@Test(expected=NullPointerException.class)
	public void test2() {
		sena.create(13);
	}
	
	// Testar se o tamanho do array é igual a 6 - exe 1a
	@Test
	public void test3() {
		assertEquals(6, sena.create(6).length);
	}
	
	// Testar se o tamho do array é igual a 12  - exe 1a
	@Test
	public void test4() {
		assertEquals(12, sena.create(12).length);
	}
	
	//Testar se os numeros estão no intervalo - exe 1b
	@Test
	public void test5() {
		
		for(int elemento: sena.create(6))
		{
			if(elemento < 1 || elemento > 60)
			{
				fail("O numero " + elemento + "não está no intervalo");
			}
		}
	}

	// Testar se os numeros estão ordenados - exe 1c
	@Test
	public void test6()
	{
		int anterior = 0;
		
		for(int elemento: sena.create(12) )
		{
			if (anterior > elemento) 
			{
				fail("Não está ordenada");
			}
			anterior = elemento;
		}
	}
	
	
	// Testar se existem numeros repetido - exe 1d
	@Test
	public void test7()
	{
		int cont = 0;
		
		for(int numero: sena.create(12))
		{
			for(int segundoNumero: sena.create(12))
			{
				if(numero == segundoNumero)
				{
					cont += 1;
				}
			}
			
			if(cont > 1)
			{
				fail("Contem numeros repetidos");
			}
			
			cont = 0;
		}		
	}



}
