package arsw.parcial.service;

import arsw.parcial.connection.Connection;
import java.io.IOException;
import java.util.HashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2099190
 */
@Service
public class ServiceAirports {
    
    public static HashMap<String, String> cities;

    public String getAirport(String name) throws IOException {
        
        Connection con = new Connection();
        
        String query;
        con.setCity(name);
        query = con.connection();
        
        
        System.out.println("\n\n\nQUERY:\n\n" + name + "\n\n\n");
        return query;
        
    }
    
    
    
    /*if (cities.get(name) == null) {
            String consulta;
            Connection.setCity(name);
            consulta = Connection.connection();
            cities.put(name, consulta);
            return consulta;
        } else {
            return cities.get(name);
        }*/
}
