package bo.edu.com.ingsoft.sakila;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stores", path = "stores")
public interface StoreRestRepository extends PagingAndSortingRepository<Store, Integer>{
    List<Store> findAll();
    //List<Language> findByName(@Param("name") String name);
}
