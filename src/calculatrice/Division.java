package calculatrice;
import calculatrice.exeptions.*;
import static calculatrice.exeptions.Exceptions.methodeDeclenchement;
import static calculatrice.exeptions.MonEnumException.UTILISATION_DU_ZERO;
import java.lang.ArithmeticException;
public class Division extends Operation {
    
    @Override
    protected double calcul(double a, double b) throws MonException{
        try{
            methodeDeclenchement(b);
            System.out.println("La division pas zero n'est pas autorisée");
            return 0;
        }catch (MonException e){
            System.out.println(e.getDefaultMessage()+UTILISATION_DU_ZERO);
        }
        try{
            return a/b;
        } catch(IllegalArgumentException e){
            throw new IllegalArgumentException("Operande(s) incorrecte(s)");
        }
    }
    
}
