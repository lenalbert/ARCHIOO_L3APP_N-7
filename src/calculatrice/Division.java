/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;
import java.lang.ArithmeticException;
/**
 *
 * @author lenal
 */
public class Division extends Operation {
    
    @Override
    protected double calcul(double a, double b){
        if(b==0){
            System.out.println("La division pas zero n'est pas autorisée");
            return 0;
        }
        return a/b;
    }
    
}
