package testprogram10;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import program10.CurrencyImplementation;

/**
 *
 * @author Balla
 */
public class TestProgram10 {
    
    public TestProgram10() {
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
    
    @Test(enabled = false)
    public void testIgnore(){
        CurrencyImplementation currency = new CurrencyImplementation();
        
        Assert.assertEquals(currency.getCurrency("Rand"), "Rand");
    } 
}