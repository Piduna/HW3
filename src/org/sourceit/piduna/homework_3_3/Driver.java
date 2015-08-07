package org.sourceit.piduna.homework_3_3;

import java.util.Scanner;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Driver {

    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private boolean ready_driver;
    private String driver_name;
    private String mobile;

    public Driver (boolean ready_driver, String driver_name, String mobile){
        this.ready_driver = ready_driver;
        this.driver_name = driver_name;
        this.mobile = mobile;
    }

    public boolean isReady_driver (){
        return ready_driver;
    }

    public String getDriver_name (){
        return driver_name;
    }

    public String getMobile (){
        return mobile;
    }

    public void setReady_driver (boolean ready_driver){
        this.ready_driver = ready_driver;
    }

    public void setDriver_name (String driver_name){
        this.driver_name = driver_name;
    }

    public void setMobile (String mobile){
        this.mobile = mobile;
    }

    public static Driver pickDriver(){
        System.out.println("Pick drivers, that status is true. Please, select a driver from list: ");
        System.out.printf("%2s %19s %19s %18s", "Id", "Driver", "Mobile", "Status");
        System.out.printf("\n");
        Depot.arrayDrivers();
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();

        switch (d) {
            case 1:
                Depot.driver = Depot.d1;
                break;
            case 2:
                Depot.driver = Depot.d2;
                break;
            case 3:
                Depot.driver = Depot.d3;
                break;
            case 4:
                Depot.driver = Depot.d4;
                break;
            case 5:
                Depot.driver = Depot.d5;
                break;
        }
        return Depot.driver;
    }

    public void repair () {
        if (isReady_driver() == false) {
            System.out.println("The driver " + getDriver_name() + " is not ready. The driver is removed today.");
        } else {
            System.out.println("Your pick: " + driver_name + ". Mobile phone: " + mobile);
        }
    }

    public void showforchief () {
        System.out.printf("%2s %19s %19s %18s", id, driver_name, mobile, ready_driver);
    }

    public void end_passage (Car car) {
        if (car.getReady_car() >= 70 && isReady_driver() == true) {
            System.out.println("\nThe passage is OK. Good luck.");
        }
        int n = car.getReady_car() - 1;
        System.out.println("Car after passage: " + n + "%");
        if (n < 70) {
            System.out.println("Car need to repair");
        } else if (n >= 70) {
            System.out.println("Car is ready for other passage");
        }
    }

    public String toString(){
        return String.format("%2s %19s %19s %18s", id, driver_name, mobile, ready_driver);
    }
}
