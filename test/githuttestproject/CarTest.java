/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githuttestproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonas
 */
public class CarTest {
    
    public CarTest() {
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
     * Test of drive method, of class Car.
     */
    @Test
    public void testDrive() {
        System.out.println("drive");
        int secondsToDrive = 1;
        Car instance = new Car("test");
        instance.drive(secondsToDrive);
        assertEquals(2, instance.getMetersDrivenTotal());
    }

    
    
}
