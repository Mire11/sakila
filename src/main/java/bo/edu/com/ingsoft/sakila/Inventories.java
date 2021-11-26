package bo.edu.com.ingsoft.sakila;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Inventories {
    List<Inventory> inventoryList = new ArrayList<>();

    @GetMapping(path="/inventoryOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Inventory> listAll() {
        return inventoryList;
    }

    @PostMapping(path="/inventory", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Inventory listAll(@RequestBody Inventory inventory) {
        inventoryList.add(inventory);
        return inventory;
    }
    
}
