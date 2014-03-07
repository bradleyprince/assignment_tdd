/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram1;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import program1.CalculatorImplementation;

/**
 *
 * @author Balla
 */
public class Program1Test {
    
    public Program1Test() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testAdd(){
        CalculatorImplementation calc = new CalculatorImplementation();
        
        Assert.assertEquals(calc.add(3), 5);
    }
}