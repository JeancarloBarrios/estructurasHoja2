

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class postCalcTest {
    
    public postCalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setString method, of class postCalc.
     */
    @Test
    public void testSetString() {
        System.out.println("setString");
        String linea = "";
        postCalc instance = new postCalc();
        instance.setString(linea);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcularVector method, of class postCalc.
     */
    @Test
    public void testCalcularVector() {
        System.out.println("calcularVector");
        postCalc instance = new postCalc();
        boolean expResult = true;
        boolean result = instance.calcularVector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    /**
     * Test of getResultado method, of class postCalc.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        StackVector prueba = new StackVector();
        prueba.push(10);
        int expResult = 10;
        
        int result = (int) prueba.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
