/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram9;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import program9.AnimalImplementation;

/**
 *
 * @author Balla
 */
public class TestProgram9 {
    
    public TestProgram9() {
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
    public void testFail(){
        AnimalImplementation animal = new AnimalImplementation();
        
        Assert.fail("Cannot find animal of type " + animal.getType("Reptile"));
    }
}