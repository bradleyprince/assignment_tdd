/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author Balla
 */
public class DividerImplementation implements Divider{
    private double number = 10.00;
    
    @Override
    public double divide(double dividend){
        this.number = this.number/dividend;
        
        return this.number;
    }
    
}
