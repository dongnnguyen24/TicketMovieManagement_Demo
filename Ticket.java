
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lukasss
 */
public class Ticket {
    private int id;
    private String film_name;
    private int number_of_seats;
    private Date showtime;
    private int duration;
    private int price;
    private int number_of_cinemas;
    private int status;
    
    //Contructor
    public Ticket() {
        this.id = 1;
        this.film_name = "";
        this.number_of_seats = 1;
        this.showtime = new Date();
        this.duration = 1;
        this.price = 1;
        this.number_of_cinemas = 1;
        this.status = 1;
    }

    public Ticket(int id, String film_name, int number_of_seats, Date showtime, int duration, int price, int number_of_cinemas, int status) {
        this.id = id;
        this.film_name = film_name;
        this.number_of_seats = number_of_seats;
        this.showtime = showtime;
        this.duration = duration;
        this.price = price;
        this.number_of_cinemas = number_of_cinemas;
        this.status = status;
    }
    
   //Getter 
    public int getId() {
        return id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public Date getShowtime() {
        return showtime;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber_of_cinemas() {
        return number_of_cinemas;
    }

    public int getStatus() {
        return status;
    }
    
    //Setter 
    public void setId(int id) {
        this.id = id;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public void setShowtime(Date showtime) {
        this.showtime = showtime;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber_of_cinemas(int number_of_cinemas) {
        this.number_of_cinemas = number_of_cinemas;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", film_name=" + film_name + ", number_of_seats=" + number_of_seats + ", showtime=" + showtime + ", duration=" + duration + ", price=" + price + ", number_of_cinemas=" + number_of_cinemas + ", status=" + status + '}';
    }
    
    
    

}
