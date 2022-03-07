package examen;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class FechaTest {
	
	public static Fecha f=new Fecha();
	
	
	@Test
	void CP1(){
		assertEquals(false,f.validarFecha(2002,10,-1));
	}
	@Test
	void CP2(){
		assertEquals(false,f.validarFecha(2002,13,-1));
	}
	@Test
	void CP3(){
		assertEquals(false,f.validarFecha(2002,-1,1));
	}
	@Test
	void CP4(){
		assertEquals(false,f.validarFecha(-1,10,1));
	}
}
