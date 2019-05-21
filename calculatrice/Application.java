package calculatrice;

import calculatrice.exeptions.MonEnumException;
import calculatrice.exeptions.MonException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CalculatorConf.init();
        
        String lang = "FR";
        if(lang.equals("FR")){
            MyProperties.load("src\\calculatrice\\message_fr.properties");
        }
        else{
            MyProperties.load("\\src\\calculatrice\\message_en.properties");
        }
        new Thread(new Runnable(){
            public void run(){
                
                try {
                    ServiceCalculatrice.launch();
                } catch (IOException | ClassNotFoundException e) {
                    Logger.getLogger(Application.class.getName()).log(Level.INFO, null, e);
                }
            }
        }).start();
        
        
        IHM ihm = new LigneCommande();
        ihm.lancer();
        System.exit(0);
    }
    
}


