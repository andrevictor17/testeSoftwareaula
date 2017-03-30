package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NoTest {

	No no;
	
	@Before
	public void setUp(){
		no = new No(10);
	}
	
	@Test
	public void contrutorNo(){		
		assertNotNull(no);
	}
	
	@Test
	public void contrutorNoAnteriorVazio(){		
		assertNull(no.anterior);
	}
	
	@Test
	public void contrutorNoProximoVazio(){		
		assertNull(no.proximo);
	}
	
}
