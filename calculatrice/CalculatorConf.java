/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sofia
 */
public class CalculatorConf {
    
    public static Map<Character, Operation> config = new HashMap<Character, Operation>();
    
    public static void init(){
        config.put('+', new Addition());
        config.put('/', new Division());
    }
    
    public static Operation getOperation(char signe) {
        return config.get(signe); 
    }
    
    public static Map<Character, Operation> getMap(){
        return config;
    }
    
}
