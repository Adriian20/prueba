package com.mygroup.ej1.POJO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW
 */
public class AritmeticaTest {
    
    public AritmeticaTest() {
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
     * Test of Division method, of class Aritmetica.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        float dividendo = 8F;
        float divisor = 4F;
        Aritmetica instance = new Aritmetica();
        float expResult = 2F;
        float result = instance.Division(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of PrimerosTresDivisores method, of class Aritmetica.
     */
    @Test
    public void testPrimerosTresDivisores() {
        System.out.println("PrimerosTresDivisores");
        int num = 1;
        Aritmetica instance = new Aritmetica();
        int[] expResult = {1,-1,-1};
        int[] result = instance.PrimerosTresDivisores(num);
        assertArrayEquals(expResult, result);
    }    
}
