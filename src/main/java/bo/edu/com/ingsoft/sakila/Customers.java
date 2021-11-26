package bo.edu.com.ingsoft.sakila;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Customers {
    List<Customer> customerList = new ArrayList<>();

    @GetMapping(path="/customerOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Customer> listAll() {
        return customerList;
    }

    @PostMapping(path="/customer", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Customer listAll(@RequestBody Customer customer) {
        customerList.add(customer);
        return customer;
    }
    
}
