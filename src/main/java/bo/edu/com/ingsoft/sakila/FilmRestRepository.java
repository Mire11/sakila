package bo.edu.com.ingsoft.sakila;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "films", path = "films")
public interface FilmRestRepository extends PagingAndSortingRepository<Film, Integer>{
    List<Film> findAll();
    //List<Film> findByTitle(@Param("title") String title);
}

