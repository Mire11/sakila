package bo.edu.com.ingsoft.sakila;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Stores {
    List<Store> storeList = new ArrayList<>();

    @GetMapping(path="/storeOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Store> listAll() {
        return storeList;
    }

    @PostMapping(path="/store", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Store listAll(@RequestBody Store store) {
        storeList.add(store);
        return store;
    }
}
