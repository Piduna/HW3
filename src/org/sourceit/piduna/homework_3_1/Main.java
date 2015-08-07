package org.sourceit.piduna.homework_3_1;

import java.util.Scanner;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Main {
    public static void main(String[] args) {

        Product[] product = new Product[5];
        product[0] = new Product("Milk 2,5%", "1234567891011", "NY Ltd.", 5.35, 7, 1);
        product[1] = new Product("Sunflower oil 1,0", "1234567891012", "UA Ltd.", 10.25, 360, 5);
        product[2] = new Product("Pepsi 0,5", "1234567891013", "UK Ltd.", 4.85, 180, 8);
        product[3] = new Product("Coca-Cola 0,5", "1234567891014", "USA Ltd.", 4.65, 180, 6);
        product[4] = new Product("Bread moskovskiu", "1234567891015", "Rus Ltd.", 5.65, 3, 3);

        System.out.println("ALL PRODUCTS");
        System.out.printf("%2s %19s %19s %18s %14s %11s %16s", "Id", "Name", "UPC",
                "Manufactor", "Price, UAH", "BBD, days", "Inventory, pcs.");
        System.out.println();
        for (int i = 0; i < product.length; i++) {
            product[i].show();
        }

        System.out.println(" ");
        Scanner name_product = new Scanner(System.in);
        System.out.print("Please input you product: ");
        String n = name_product.nextLine();
        System.out.println("\nPRODUCT: " + n);
        System.out.printf("%2s %19s %19s %18s %14s %11s %16s", "Id", "Name", "UPC",
                "Manufactor", "Price, UAH", "BBD, days", "Inventory, pcs.");
        System.out.println();
        for (int i = 0; i < product.length; i++) {
            product[i].special_name(n);
        }

        System.out.println(" ");
        Scanner price_product = new Scanner(System.in);
        System.out.print("Please input you price: ");
        int p = price_product.nextInt();
        System.out.println("\nThere is all product that");
        System.out.println("PRICE < " + p + " UAH");
        System.out.printf("%2s %19s %19s %18s %14s %11s %16s", "Id", "Name", "UPC",
                "Manufactor", "Price, UAH", "BBD, days", "Inventory, pcs.");
        System.out.println();
        for (int i = 0; i < product.length; i++) {
            product[i].special_price(p);
        }

        System.out.println(" ");
        Scanner bbd_product = new Scanner(System.in);
        System.out.print("Please input you bbd: ");
        int b = bbd_product.nextInt();
        System.out.println("\nThere is all product that");
        System.out.println("BBD > " + b + " DAYS");
        System.out.printf("%2s %19s %19s %18s %14s %11s %16s", "Id", "Name", "UPC",
                "Manufactor", "Price, UAH", "BBD, days", "Inventory, pcs.");
        System.out.println();
        for (int i = 0; i < product.length; i++) {
            product[i].special_bbd(b);
        }

    }
}

