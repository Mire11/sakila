package bo.edu.com.ingsoft.sakila;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Films {
    List<Film> filmList = new ArrayList<>();

    @GetMapping(path="/filmOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Film> listAll() {
        return filmList;
    }

    @PostMapping(path="/film", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Film listAll(@RequestBody Film film) {
        filmList.add(film);
        return film;
    }
    
}
