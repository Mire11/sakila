package bo.edu.com.ingsoft.sakila;

import java.sql.Date;
import java.text.DecimalFormat;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="payment")
public class Payment {
    @Id
    //@Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payment_id;
    private Integer customer_id;
    private Integer staff_id;
    private Integer rental_id;
    private Double amount;
    private Date payment_date;
    private Date last_update;

    public Payment(){

    }
    public Double getAmount() {
        return amount;
    }
    public Integer getCustomer_id() {
        return customer_id;
    }
    public Date getLast_update() {
        return last_update;
    }
    public Date getPayment_date() {
        return payment_date;
    }
    public Integer getPayment_id() {
        return payment_id;
    }
    public Integer getRental_id() {
        return rental_id;
    }
    public Integer getStaff_id() {
        return staff_id;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }
    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }
    public void setRental_id(Integer rental_id) {
        this.rental_id = rental_id;
    }
    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }
}
