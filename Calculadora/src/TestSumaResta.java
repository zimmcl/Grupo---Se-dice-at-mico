import static org.junit.Assert.*;

public class TestSumaResta {
	
	public void testSumarDosNumeros() throws Exception{
		
		SumaResta sumaRest1 = new SumaResta();
        /*
         * Ingreso de Cadena manual "2+3";
         */
        
        assertEquals(5, sumaRest1.getRes(), 0.1);
	}

}
