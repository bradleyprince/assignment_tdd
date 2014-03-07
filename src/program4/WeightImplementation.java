/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program4;

/**
 *
 * @author Balla
 */
public class WeightImplementation implements Weight{
    private double mass = 76.0;
    
    @Override
    public boolean getWeight(double weight) {
        if(this.mass == weight){
            return true;
        }else{
            return false;
        }
    }
    
}
