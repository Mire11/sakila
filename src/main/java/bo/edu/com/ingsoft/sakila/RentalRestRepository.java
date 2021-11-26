package bo.edu.com.ingsoft.sakila;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "rentals", path = "rentals")
public interface RentalRestRepository extends PagingAndSortingRepository<Rental, Integer>{
    List<Rental> findAll();
    //List<Retal> findByName(@Param("name") String name);
}
