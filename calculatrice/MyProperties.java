package calculatrice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author lenal
 */
public class MyProperties {
    
    private static Properties prop = new Properties();
    
    public static void load(String filename) throws IOException, FileNotFoundException{
      
        FileInputStream input = new FileInputStream(filename); 
        try{
            prop.load(input);
            //this.prop=prop;
        } finally{
            input.close();
        }
    }
    
    public static String readProperty(String key){
        return prop.getProperty(key);
    }
   
}
    
    

    
    

