/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapitagoras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 312C-21
 */
public class PitagorasTest {
    
    public PitagorasTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Calcular_Hipotenusa method, of class Pitagoras.
     */
    @Test
    public void testCalcular_Hipotenusa() {
        System.out.println("Calcular_Hipotenusa");
        double a = 2;
        double b = 3;
        double expResult = 5;
        double result = Pitagoras.Calcular_Hipotenusa(a, b);
        assertEquals(expResult, result, 5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
