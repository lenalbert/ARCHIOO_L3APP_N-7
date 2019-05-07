/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import static calculatrice.CalculatorConf.config;
import java.util.Scanner;

/**
 *
 * @author lenal
 */
public class LigneCommande implements IHM{
    
    static Scanner sc = new Scanner(System.in);
   
    public void lancer(){
        System.out.println("Saisir a : ");
        while(!sc.hasNextDouble()){
            System.out.println("Merci de saisir un chiffre!");
            sc.nextLine();
        }
        double a = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Saisir b : ");
        while(!sc.hasNextDouble()){
            System.out.println("Merci de saisir un chiffre!");
            sc.nextLine();
        }
        double b = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Saisir operateur : ");
        char operator = sc.next().charAt(0);
        while(!config.containsKey(operator)){
            System.out.println("Merci de saisir un operateur valide!");
            operator = sc.next().charAt(0);
        }
        
        Calculator calculer = new Calculator();
        System.out.println(calculer.appelOperation(a, b, operator));
    }
    
}
