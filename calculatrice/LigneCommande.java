
package calculatrice;
import static calculatrice.CalculatorConf.config;
import static calculatrice.exeptions.Exceptions.methodeDeclenchement;
import static calculatrice.exeptions.MonEnumException.UTILISATION_DU_ZERO;
import calculatrice.exeptions.MonException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LigneCommande implements IHM{
    
    static Scanner sc = new Scanner(System.in);
   
    @Override
    public void lancer() throws IOException, ClassNotFoundException{
        
        System.out.println(MyProperties.readProperty("FIRST_DIGIT"));
        while(!sc.hasNextDouble()){
            System.out.println(MyProperties.readProperty("NUMBER_ONLY"));
            sc.nextLine();
        }
        double a = sc.nextDouble();
        sc.nextLine();
        
        System.out.println(MyProperties.readProperty("SECOND_DIGIT"));
        while(!sc.hasNextDouble()){
            System.out.println(MyProperties.readProperty("NUMBER_ONLY"));
            sc.nextLine();
        }
        double b = sc.nextDouble();
        sc.nextLine();
        
        System.out.println(MyProperties.readProperty("OPERATOR"));
        char operator = sc.next().charAt(0);
        while(!config.containsKey(operator)){
            System.out.println(MyProperties.readProperty("OPERATOR_ONLY"));
            operator = sc.next().charAt(0);
        }
        
        try {
            double res = RequeteCalculatrice.call(a+"~@~"+b+"~@~"+operator);
            System.out.println(res);
        } catch (IOException ex) {
            throw new IOException();
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException();
        }
        
        /*Calculator calculer = new Calculator();
            try {
            System.out.println(calculer.appelOperation(a, b, operator));
            } catch (MonException e) {
            Logger.getLogger(LigneCommande.class.getName()).log(Level.INFO, null, e);
            }*/
        
        
    }
    
    
    
}
