package aula;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CadastroTest {
	
	Cadastro cad;

	//Exercicio 2 - a
	
	@Test // "teste.txt"
	public void construtor1() throws IOException{
		cad = new Cadastro("teste.txt");
		assertNotNull(cad);
	}

	@Test(expected=IOException.class) // ""
	public void construtor2() throws IOException{
		cad = new Cadastro("");
		assertNotNull(cad);
	}
	
	@Test(expected=NullPointerException.class)// null
	public void construtor3() throws IOException{
		cad = new Cadastro(null);
		assertNotNull(cad);
	}
	
	//Exercicio 2 - b
	
	@Test //1 e "De volta para o futuro I"
	public void testInsert1() throws IOException{
		cad = new Cadastro("filmes.txt");	
		
		assertTrue(cad.insert(1, "De volta para o futuro I"));
	}
	
	@Test //0 e "Missão impossível I"
	public void testInsert2() throws IOException{
		cad = new Cadastro("filmes.txt");	
		
		assertFalse(cad.insert(0, "Missão impossível I"));
	}
	
	@Test //2 e null
	public void testInsert3() throws IOException{
		cad = new Cadastro("filmes.txt");	
		
		assertFalse(cad.insert(2, null));	
	}
	
	@Test //3 e ""
	public void testInsert4() throws IOException{
		cad = new Cadastro("filmes.txt");		
		assertFalse(cad.insert(3, ""));
	}
	

}
