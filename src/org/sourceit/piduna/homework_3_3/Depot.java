package org.sourceit.piduna.homework_3_3;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Depot {

    public static Driver driver;
    protected static Driver d1 = new Driver(true, "Vasya", "0965476005");
    protected static Driver d2 = new Driver(false, "Igor", "0965476006");
    protected static Driver d3 = new Driver(false, "Anton", "0965476007");
    protected static Driver d4 = new Driver(true, "Valeriu", "0965476009");
    protected static Driver d5 = new Driver(true, "Ruslan", "0965476010");

    public static void arrayDrivers() {
        Driver driver[] = {d1, d2, d3, d4, d5};
        for (Driver d : driver) {
            System.out.println(d);
        }
    }

    public static Car car;
    protected static Car c1 = new Car(100, "Volvo", "21AH");
    protected static Car c2 = new Car(20, "Toyota", "48HW");
    protected static Car c3 = new Car(30, "21099", "55ZE");
    protected static Car c4 = new Car(70, "BMW X6", "65WW");
    protected static Car c5 = new Car(80, "Mazda 3", "77KH");

    public static void arrayCars() {
        Car car[] = {c1, c2, c3, c4, c5};
        for (Car c : car) {
            System.out.println(c);
        }
    }
}
