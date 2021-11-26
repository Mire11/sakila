package bo.edu.com.ingsoft.sakila;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentRestRepository extends PagingAndSortingRepository<Payment, Integer>{
    List<Payment> findAll();
    //List<Customer> findByName(@Param("first_name") String first_name);
}