package bo.edu.com.ingsoft.sakila;
import java.sql.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private Integer store_id;
    private String first_name;
    private String last_name;
    private String email;
    private Integer address_id;
    private Integer active;
    private Date last_update;

    public Customer() {

    }
    public Integer getActive() {
        return active;
    }
    public Integer getAddress_id() {
        return address_id;
    }
    public Integer getCustomer_id() {
        return customer_id;
    }
    public String getEmail() {
        return email;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public Date getLast_update() {
        return last_update;
    }
    public Integer getStore_id() {
        return store_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }
    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }
    public void setActive(Integer active) {
        this.active = active;
    }

}

