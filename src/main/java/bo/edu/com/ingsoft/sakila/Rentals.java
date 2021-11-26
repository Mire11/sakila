package bo.edu.com.ingsoft.sakila;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Rentals {
    List<Rental> rentalList = new ArrayList<>();

    @GetMapping(path="/rentalOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Rental> listAll() {
        return rentalList;
    }

    @PostMapping(path="/rental", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Rental listAll(@RequestBody Rental rental) {
        rentalList.add(rental);
        return rental;
    }
}
