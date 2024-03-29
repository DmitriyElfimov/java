package OOP.Homework005.models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;

    private final int id;

    private Date date;

    private String name;

    {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Reservation.counter = counter;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }


}
