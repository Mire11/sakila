package bo.edu.com.ingsoft.sakila;

import java.sql.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="rental")
public class Rental {
    @Id
    //@Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rental_id;
    private Date rental_date;
    private Integer inventory_id;
    private Integer customer_id;
    private Date return_date;
    private Integer staff_id;
    private Date last_update;

    public Rental(){

    }

    public Integer getCustomer_id() {
        return customer_id;
    }
    public Integer getInventory_id() {
        return inventory_id;
    }
    public Date getLast_update() {
        return last_update;
    }
    public Integer getRental_id() {
        return rental_id;
    }
    public Date getRental_date() {
        return rental_date;
    }
    public Date getReturn_date() {
        return return_date;
    }
    public Integer getStaff_id() {
        return staff_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
    public void setInventory_id(Integer inventory_id) {
        this.inventory_id = inventory_id;
    }
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    public void setRental_id(Integer rental_id) {
        this.rental_id = rental_id;
    }
    public void setRental_date(Date rental_date) {
        this.rental_date = rental_date;
    }
    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }
}
