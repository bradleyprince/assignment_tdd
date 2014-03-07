/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

/**
 *
 * @author Balla
 */
public class CalculatorImplementation implements Calculator{
    private int number = 2;
    
    @Override
    public int add(int num) {
        this.number = this.number + num;
        return this.number;
    }  
}
