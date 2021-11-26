package bo.edu.com.ingsoft.sakila;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Payments {
    List<Payment> paymentList = new ArrayList<>();

    @GetMapping(path="/paymentOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Payment> listAll() {
        return paymentList;
    }

    @PostMapping(path="/payment", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Payment listAll(@RequestBody Payment payment) {
        paymentList.add(payment);
        return payment;
    }
}
