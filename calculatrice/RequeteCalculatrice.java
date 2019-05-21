/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;

/**
 *
 * @author lenal
 */
public class RequeteCalculatrice {
    
    private static int PORT =33001;

    public static double call(String str) throws IOException, ClassNotFoundException{
        InetAddress host = InetAddress.getLocalHost();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        
        Socket socket = new Socket(host.getHostName(), PORT);
        
        oos = new ObjectOutputStream(socket.getOutputStream());
        LOGGER.log(Level.INFO, "Connection to server established");
        
        LOGGER.log(Level.INFO, "Sending request to socket server");
        oos.writeObject(str);
        
        ois=new ObjectInputStream(socket.getInputStream());
        double result = (double) ois.readObject();
        LOGGER.log(Level.INFO, "Received response : "+result);
        
        socket.close();
        
        return result;
    }
}
