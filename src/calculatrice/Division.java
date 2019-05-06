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
public class Division {
    
    protected double div(double a, double b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Division by 0 is not allowed");
        }
        double res = a/b;
        System.out.println(a+" / "+b+" = "+res );
        return res;
    }
    
}
