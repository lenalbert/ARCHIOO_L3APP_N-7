package calculatrice;
import calculatrice.exeptions.*;
import static calculatrice.exeptions.Exceptions.methodeDeclenchement;
import static calculatrice.exeptions.MonEnumException.UTILISATION_DU_ZERO;
import java.lang.ArithmeticException;
public class Division extends Operation {
    
    @Override
    public double calcul(double a, double b) throws MonException{
        if(b==0)
            throw new MonException(1, MonEnumException.UTILISATION_DU_ZERO.getDefaultMessage());
        try{
            return a/b;
        } catch(IllegalArgumentException e){
            throw new IllegalArgumentException("Operande(s) incorrecte(s)");
        }
    }
    
}
