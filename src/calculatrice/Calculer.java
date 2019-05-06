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
public class Calculer {
    
    protected void appelOperation(double a, double b, char operator){
        switch(operator){
            case '+':
                Addition addition = new Addition();
                addition.add(a, b);
            break;
            case '/':
                Division division = new Division();
                division.div(a, b);
            break;
            default:
                System.out.println("Unknown operand type");
        }
    }
    
}
