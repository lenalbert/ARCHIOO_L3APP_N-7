package calculatrice;
import calculatrice.exeptions.MonException;

public class Calculator {
    
    protected double appelOperation(double a, double b, char operator) throws MonException {
        try{
            Operation op = CalculatorConf.getOperation(operator);
            return op.calcul(a, b);
        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException("Operateur incorrect");
        }
        
    }
    
}
