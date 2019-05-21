package calculatrice;
import calculatrice.exeptions.MonException;

public class Calculator {
    
    public static double appelOperation(double a, double b, char operator) throws MonException {
        if(!CalculatorConf.getMap().containsKey(operator)){
            System.out.println("BUG");
            throw new IllegalArgumentException();
        }
        Operation op = CalculatorConf.getOperation(operator);
        return op.calcul(a, b);
    }
    
}
