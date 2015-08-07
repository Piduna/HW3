package org.sourceit.piduna.homework_3_3;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Dispatcher {

    private String disp_name;

    public Dispatcher(String disp_name){
        this.disp_name = disp_name;
    }

    public String getDisp_name (){
        return disp_name;
    }

    public void setDisp_name (String disp_name){
        this.disp_name = disp_name;
    }

    public String toString (){
        return getDisp_name();
    }

    public static void checkDriver (Driver driver) {
        driver.repair();
    }

    public static void checkCar (Car car) {
        car.repair();
    }

    public static void checkPassage (Driver driver, Car car) {
        driver.end_passage(Depot.car);
    }
}
