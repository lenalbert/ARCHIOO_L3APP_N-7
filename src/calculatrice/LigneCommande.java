/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.util.Scanner;

/**
 *
 * @author lenal
 */
public class LigneCommande implements IHM{
    
    static Scanner sc = new Scanner(System.in);
   
    public void lancer(){
        System.out.println("Saisir a : ");
        double a = sc.nextDouble();
        System.out.println("Saisir b : ");
        double b = sc.nextDouble();
        System.out.println("Saisir operateur : ");
        char operator = sc.next().charAt(0);
        Calculer calculer = new Calculer();
        calculer.appelOperation(a, b, operator);
    }
    
}
