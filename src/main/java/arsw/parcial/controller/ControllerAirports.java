package arsw.parcial.controller;

import arsw.parcial.service.ServiceAirports;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.Controller;

/**
 *
 * @author 2099190
 */
//@ControllerAirports
@RestController
@RequestMapping
public class ControllerAirports {
    
    @Autowired
    ServiceAirports services;

    @ResponseBody
    @GetMapping(value="/aeropuerto/{name}")
    public ResponseEntity<?> getCity(@PathVariable("name") String name) {
        try {
            String query;
            query = services.getAirport(name);
            return new ResponseEntity<>(query,HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR 404 NOT FOUND", HttpStatus.NOT_FOUND);
        }
    }
    
}
