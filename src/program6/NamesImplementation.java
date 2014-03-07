/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program6;

/**
 *
 * @author Balla
 */
public class NamesImplementation implements Names{
    private String[] names = {"Bradley", "Leroy", "Tremaine"};
    
    @Override
    public String[] getNames() {
        return names;
    }
    
}
