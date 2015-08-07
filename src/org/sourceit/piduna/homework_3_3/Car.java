package org.sourceit.piduna.homework_3_3;

import java.util.Scanner;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Car {

    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private int ready_car;
    private String car_name;
    private String number;

    public Car (int ready_car, String car_name, String number){
        this.ready_car = ready_car;
        this.car_name = car_name;
        this.number = number;
    }

    public int getReady_car () {
        return ready_car;
    }

    public String getCar_name (){
        return car_name;
    }

    public String getNumber () {
        return number;
    }


    public void setReady_car (int ready_car) {
        this.ready_car = ready_car;
    }

    public void setCar_name (String car_name){
        this.car_name = car_name;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public void repair () {
        if (getReady_car() >= 70) {
            System.out.println("Your pick: " + getCar_name() + ". Number: " + getNumber());
        } else {
            System.out.println("Car is on repair");
        }
    }

    public void showforchief () {
        System.out.printf("%2s %19s %19s %18s", id, car_name, number, ready_car);
    }

    public static Car pickCar (){
        System.out.println("Pick cars, that status is more 70%. Please, select a car from list: ");
        System.out.printf("%2s %19s %19s %18s", "Id", "Model", "Number", "Status, %");
        System.out.printf("\n");
        Depot.arrayCars();
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                Depot.car = Depot.c1;
                break;
            case 2:
                Depot.car = Depot.c2;
                break;
            case 3:
                Depot.car = Depot.c3;
                break;
            case 4:
                Depot.car = Depot.c4;
                break;
            case 5:
                Depot.car = Depot.c5;
                break;
        }
        return Depot.car;
    }

    public String toString () {
        return String.format("%2s %19s %19s %18s", id, car_name, number, ready_car);    }
}
