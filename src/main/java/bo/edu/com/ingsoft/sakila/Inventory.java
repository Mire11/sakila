package bo.edu.com.ingsoft.sakila;

import java.sql.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="inventory")
public class Inventory {
    @Id
    //@Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inventory_id;
    private Integer film_id;
    private Integer store_id;
    private Date last_update;
    //@Column(name="last_update")

    public Inventory(){

    }
    public Integer getFilm_id() {
        return film_id;
    }
    public Integer getInventary_id() {
        return inventory_id;
    }
    public Date getLast_update() {
        return last_update;
    }
    public Integer getStore_id() {
        return store_id;
    }
    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }
    public void setInventary_id(Integer inventary_id) {
        this.inventory_id = inventary_id;
    }
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

}
