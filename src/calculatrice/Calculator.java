/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;


/**
 *
 * @author lenal
 */
public class Calculator {
    
    protected double appelOperation(double a, double b, char operator){
        Operation op = CalculatorConf.getOperation(operator);
        return op.calcul(a, b);
    }
    
}
