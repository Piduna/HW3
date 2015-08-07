package org.sourceit.piduna.homework_3_3;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Passage {

    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String from_driver;
    private String where_driver;
    private double price;
    private boolean end;

    public Passage(String from_driver, String where_driver, double price) {
        this.price = price;
        this.from_driver = from_driver;
        this.where_driver = where_driver;
    }

    public int getId() {
        return id;
    }

    public String getFrom_driver() {
        return from_driver;
    }

    public String getWhere_driver() {
        return where_driver;
    }

    public double getPrice () { return price; }


    public void setId(int id) {
        this.id = id;
    }

    public void setFrom_driver(String from_driver) {
        this.from_driver = from_driver;
    }

    public void setWhere_driver(String where_driver) {
        this.where_driver = where_driver;
    }

    public void setPrice (double price) { this.price = price; }

    public String toString(){
        return String.format("%2s %19s %19s %18s", id, from_driver, where_driver, price);
    }

}
