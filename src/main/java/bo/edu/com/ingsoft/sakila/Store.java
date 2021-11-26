package bo.edu.com.ingsoft.sakila;

import java.sql.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="store")
public class Store {
    @Id
    //@Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer store_id;
    private Integer manager_staff_id;
    private Integer address_id;
    private Date last_update;

    public Store(){

    }

    public Integer getAddress_id() {
        return address_id;
    }
    public Date getLast_update() {
        return last_update;
    }
    public Integer getManager_staff_id() {
        return manager_staff_id;
    }
    public Integer getStore_id() {
        return store_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    public void setManager_staff_id(Integer manager_staff_id) {
        this.manager_staff_id = manager_staff_id;
    }
    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }
}
