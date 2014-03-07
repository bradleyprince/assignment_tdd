/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program7;

/**
 *
 * @author Balla
 */
public class CompareImplementation implements Compare{
    private Dog dog = new Dog();
    
    @Override
    public Dog getDog() {
        return dog;
    }
    
}
