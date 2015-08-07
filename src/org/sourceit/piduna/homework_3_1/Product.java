package org.sourceit.piduna.homework_3_1;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Product {

    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String upc;
    private String manufactor;
    private double price;
    private int bbd;
    private int inventory;

    public Product (String name, String upc, String manufactor, double price, int bbd, int inventory){
        this.name=name;
        this.upc=upc;
        this.manufactor=manufactor;
        this.price=price;
        this.bbd=bbd;
        this.inventory=inventory;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getUpc(){
        return upc;
    }
    public String getManufactor(){
        return manufactor;
    }
    public double getPrice(){
        return price;
    }
    public int getBbd(){
        return bbd;
    }
    public int getInventory(){
        return inventory;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setUpc(String upc){
        this.upc=upc;
    }
    public void setManufactor(String manufactor){
        this.manufactor=manufactor;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setBbd(int bbd){
        this.bbd=bbd;
    }
    public void setInventory(int inventory){
        this.inventory=inventory;
    }

    public void show() {
        System.out.printf("%2s %19s %19s %18s %14s %11s %15s", getId(), getName(), getUpc(),
                getManufactor(), getPrice(), getBbd(), getInventory());
        System.out.println();
    }

    public void special_name(String str_name) {
        if ((this.getName().equals(str_name))) {
            System.out.printf("%2s %19s %19s %18s %14s %11s %15s", getId(), getName(), getUpc(),
                    getManufactor(), getPrice(), getBbd(), getInventory());
            System.out.println();
        }
    }

    public void special_price(int int_price) {
        if ((this.getPrice() < int_price)) {
            System.out.printf("%2s %19s %19s %18s %14s %11s %15s", getId(), getName(), getUpc(),
                    getManufactor(), getPrice(), getBbd(), getInventory());
            System.out.println();
        }
    }

    public void special_bbd(int int_bbd) {
        if ((this.getBbd() > int_bbd)) {
            System.out.printf("%2s %19s %19s %18s %14s %11s %15s", getId(), getName(), getUpc(),
                    getManufactor(), getPrice(), getBbd(), getInventory());
            System.out.println();
        }
    }
}
