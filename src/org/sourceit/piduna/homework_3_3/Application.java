package org.sourceit.piduna.homework_3_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Application {
    public static void main(String[] args) {

        ArrayList<Dispatcher> dispatcher = new ArrayList<Dispatcher>();
        dispatcher.add(new Dispatcher("Tanya"));
        dispatcher.add(new Dispatcher("Irina"));
        dispatcher.add(new Dispatcher("Inna"));
        dispatcher.add(new Dispatcher("Natasha"));
        dispatcher.add(new Dispatcher("Polina"));

        ArrayList<Passage> passage = new ArrayList<Passage>();
        passage.add(new Passage("New Yourk", "Los Angeles", 5.65));
        passage.add(new Passage("Kyiv", "Lviv", 7.65));
        passage.add(new Passage("Moskva", "Piter", 8.80));
        passage.add(new Passage("Budapesht", "Berlin", 3.33));
        passage.add(new Passage("Riga", "Stokgolm", 2.65));

        int disp = (int) (Math.random() * dispatcher.size());
        System.out.println("Hi. You are authenticated. Your name is: " + dispatcher.get(disp));

        Scanner scanner = new Scanner(System.in);
        char achar;
        do {
            int pass = (int) (Math.random() * passage.size());
            System.out.println("Your passage is: ");
            System.out.printf("%2s %19s %19s %18s", "Id", "From", "Where", "Price");
            System.out.println("");
            System.out.println(passage.get(pass));

            System.out.printf("\n");
            boolean isReady = false;
            Driver newDriver = null;
            while (!isReady) {
                newDriver = Driver.pickDriver();
                isReady = newDriver.isReady_driver();
            }
            Dispatcher.checkDriver(newDriver);

            int Ready_car = 1;
            Car newCar = null;
            while (Ready_car < 70) {
                newCar = Car.pickCar();
                Ready_car = newCar.getReady_car();
            }
            Dispatcher.checkCar(newCar);
            Dispatcher.checkPassage(newDriver, newCar);

            System.out.println("\nDo you want to continue, " +  dispatcher.get(disp) + "? (Type y or any button) \n");
            achar = scanner.next().charAt(0);

        } while (achar == 'Y'|| achar == 'y');

    }
}
