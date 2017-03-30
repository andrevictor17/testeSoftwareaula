package aula;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

public class ListaTest {

	Lista li;
	
	@Before
	public void setUp(){
		li = new Lista();
	}
	
	@Test
	public void testarAdd(){
		li.add(10);		
		assertNotNull(li);
	}	
		
	@Test
	public void testarObjetoIgual() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		li = new Lista();
		li.add(10);
		
		Object left = null, right = null;
		
		Method metodoMostLeft;
		try {
			metodoMostLeft = Lista.class.getDeclaredMethod("getMostLeft");
			metodoMostLeft.setAccessible(true);
			
			left = metodoMostLeft.invoke(li, null);						
			
		} catch (NoSuchMethodException | SecurityException e) {			
			e.printStackTrace();
		}
		
		Method metodoMostRight;
		try {
			metodoMostRight = Lista.class.getDeclaredMethod("getMostRight");
			metodoMostRight.setAccessible(true);
			
			right = metodoMostRight.invoke(li, null);		
			
		} catch (NoSuchMethodException | SecurityException e) {			
			e.printStackTrace();
		}
		
		assertSame(left, right);
		
	}
	
	
	@Test
	public void testarObjetoDiferente() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		li = new Lista();
		li.add(10);
		li.add(11);
		
		Object left = null, right = null;
		
		Method metodoMostLeft;
		try {
			metodoMostLeft = Lista.class.getDeclaredMethod("getMostLeft");
			metodoMostLeft.setAccessible(true);
			
			left = metodoMostLeft.invoke(li, null);						
			
		} catch (NoSuchMethodException | SecurityException e) {			
			e.printStackTrace();
		}
		
		Method metodoMostRight;
		try {
			metodoMostRight = Lista.class.getDeclaredMethod("getMostRight");
			metodoMostRight.setAccessible(true);
			
			right = metodoMostRight.invoke(li, null);		
			
		} catch (NoSuchMethodException | SecurityException e) {			
			e.printStackTrace();
		}
		
		assertNotSame(left, right);
		
	}
	
	@Test
	public void testarObjetoDiferente2() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		li = new Lista();
		li.add(10);
		li.add(11);
		li.add(10);
		
		Object left = null, right = null;
		
		Method metodoMostLeft;
		try {
			metodoMostLeft = Lista.class.getDeclaredMethod("getMostLeft");
			metodoMostLeft.setAccessible(true);
			
			left = metodoMostLeft.invoke(li, null);						
			
		} catch (NoSuchMethodException | SecurityException e) {			
			e.printStackTrace();
		}
		
		Method metodoMostRight;
		try {
			metodoMostRight = Lista.class.getDeclaredMethod("getMostRight");
			metodoMostRight.setAccessible(true);
			
			right = metodoMostRight.invoke(li, null);		
			
		} catch (NoSuchMethodException | SecurityException e) {			
			e.printStackTrace();
		}
		
		assertNotSame(left, right);
		
	}

	
	
}
