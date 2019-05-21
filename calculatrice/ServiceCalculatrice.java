/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import calculatrice.exeptions.MonException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Double.parseDouble;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenal
 */
public class ServiceCalculatrice {
    private static ServerSocket server;
    private static int PORT = 33001;
    
    public static void launch() throws IOException, ClassNotFoundException{
        
        server = new ServerSocket (PORT);
        
        while (true){
            Socket socket = server.accept();
            
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            String operation = (String) ois.readObject();
            
            String []split = operation.split("~@~");
            Calculator calculer = new Calculator();
            Double result;
            try {
                result = calculer.appelOperation(Double.parseDouble(split[0]), Double.parseDouble(split[1]), split[2].charAt(0));
                oos.writeObject(result);
            } catch (MonException ex) {
                Logger.getLogger(ServiceCalculatrice.class.getName()).log(Level.INFO, null, ex);
            }
            
        }
    }
    
}
