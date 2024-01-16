package br.unesp.rc.junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    public VectorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

     /**
     * Test of equal method, of class Vector.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        int[] a = null;
        int[] b = null;
        boolean expResult = false;
        boolean result = Vector.equal(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSize() {
        System.out.println("size");        
        int a = 0;
        int b = 0;
        boolean expResult = false;
        boolean result = Vector.size(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

}
