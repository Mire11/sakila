package bo.edu.com.ingsoft.sakila;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "inventories", path = "inventories")
public interface InventoryRestRepository extends PagingAndSortingRepository<Inventory, Integer>{
    List<Inventory> findAll();
    //List<Customer> findByName(@Param("first_name") String first_name);
}
