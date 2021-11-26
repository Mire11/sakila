package bo.edu.com.ingsoft.sakila;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRestRepository extends PagingAndSortingRepository<Customer, Integer>{
    List<Customer> findAll();
    //List<Customer> findByName(@Param("first_name") String first_name);
}
