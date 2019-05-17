
package calculatrice;

import static calculatrice.CalculatorConf.config;
import static calculatrice.exeptions.Exceptions.methodeDeclenchement;
import static calculatrice.exeptions.MonEnumException.UTILISATION_DU_ZERO;
import calculatrice.exeptions.MonException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            System.out.println(calculer.appelOperation(a, b, operator));
        } catch (MonException e) {
            Logger.getLogger(LigneCommande.class.getName()).log(Level.INFO, null, e);
        }
        
        
        
        
    }
    
    
    
}
