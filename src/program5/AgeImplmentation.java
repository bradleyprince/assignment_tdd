package program5;

/**
 *
 * @author Balla
 */
public class AgeImplmentation implements Age{
    private int age = 22;
    
    @Override
    public boolean getAge() {
        if(this.age < 21){
            return true;
        }else{
            return false;
        }
    }
    
}
