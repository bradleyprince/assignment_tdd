/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram2;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import program2.Divider;
import program2.DividerImplementation;

/**
 *
 * @author Balla
 */
public class Program2Test {
    
    public Program2Test() {
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
    public void testDivide(){
        DividerImplementation div = new DividerImplementation(){};
        
        Assert.assertEquals(div.divide(3.0), 3.0, 0.5);
    }
}