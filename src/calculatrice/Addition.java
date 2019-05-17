
package calculatrice;
import java.lang.IllegalArgumentException;

public class Addition extends Operation{
    
    @Override
    protected double calcul(double a, double b) throws IllegalArgumentException{
        try{
            return a+b;
        } catch(IllegalArgumentException e){
            throw new IllegalArgumentException("Operande(s) incorrecte(s)");
        }
    }
}
