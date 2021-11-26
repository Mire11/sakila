package bo.edu.com.ingsoft.sakila;

import java.sql.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="actor")
public class Actor {
    @Id
    //@Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer actor_id;
    private String first_name;
    private String last_name;
    private Date last_update;

    public Actor(){

    }

    public Integer getActor_id() {
        return actor_id;
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


    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
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

}
