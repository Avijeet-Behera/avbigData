package com.AvijeetBehera;
import java.util.Scanner;

public class Main
{
    private static double price = 0.00;

    public static void main(String[] args)
    {
        Hamburger hamburger = SelectBurger(getSize(),getMeat(),getBread(), price);
        System.out.println("Please pay Rs " + hamburger.chooseAddons() + ", at the counter.");
    }


    public static String getSize()
    {
        int choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select the type of burger from the choices below:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        choice = keyboard.nextInt();

        if (choice == 1)
        {
            price += 20.05;
            System.out.println("Small size is selected. Price is now Rs " + price + ", Please proceed.");
            return "Small";
        }
        else if (choice == 2)
        {
            price += 40.00;
            System.out.println("Medium size is selected. Price is now Rs " + price + ", Please proceed.");
            return "Medium";
        }
        else if (choice == 3)
        {
            price += 60.00;
            System.out.println("Large size is selected. Price is now Rs " + price + ", Please proceed.");
            return "Large";
        }
        else
            price += 20.00;
            System.out.println("Your input is Invalid. Small size burger is selected by default. Price is now Rs " + price + ", Please proceed.");
        return "Small";
    }

    public static String getMeat()
    {
        int choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select the type of meat from the choices below:");
        System.out.println("1. Chicken");
        System.out.println("2. Lamb");
        System.out.println("3. Goat");
        choice = keyboard.nextInt();

        if (choice == 1)
        {
            price += 24.30;
            System.out.println("Chicken is selected. Price is now Rs " + price + ", Please proceed.");
            return "Chicken";

        }
        else if (choice == 2)
        {
            price += 37.50;
            System.out.println("Lamb is selected. Price is now Rs " + price + ", Please proceed.");
            return "Lamb";
        }
        else if (choice == 3)
        {
            System.out.println("");
            price += 42.80;
            System.out.println("Goat is selected. Price is now Rs " + price + ", Please proceed.");
            return "Goat";

        }
        else
            price += 24.30;
            System.out.println("Your input is Invalid. Chicken is selected as default. Price is now Rs " + price + ", Please proceed.");
        return "Small";
    }

    public static String getBread()
    {
        int choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select the type of bread from the choices below:");
        System.out.println("1. Thin");
        System.out.println("2. Thick");
        System.out.println("3. Crown");
        choice = keyboard.nextInt();

        if (choice == 1)
        {
            price += 5.70;
            System.out.println("Thin crust is selected. Price is now Rs " + price + ", Please proceed.");
            return "Thin";

        }
        else if (choice == 2)
        {
            price += 8.90;
            System.out.println("Thick crust is selected. Price is now Rs " + price + ", Please proceed.");
            return "Thick";
        }
        else if (choice == 3)
        {
            price += 12.50;
            System.out.println("Crown crust is selected. Price is now Rs " + price + ", Please proceed.");
            return "Crown";
        }
        else
            price += 5.70;
            System.out.println("Your input is Invalid. Thin crust is selected as default, Price is now Rs " + price + ", Please proceed.");
            return "Small";
    }


    public static Hamburger SelectBurger(String size,String meat, String bread, double price)
    {
        int choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select the type of burger from the choices below:");
        System.out.println("1. Hamburger");
        System.out.println("2. Healthy Burger");
        System.out.println("3. Deluxe Burger");
        choice = keyboard.nextInt();

        if (choice == 1)
        {
            return new Hamburger("Maharaja", size, meat, bread, price);
        }
        else if (choice == 2)
        {
            return new HealthyBurger("McHealthy", size, meat, bread, price);
        }
        else if (choice == 3)
        {
            return new DeluxeBurger("McDelux", size, meat, bread, price);
        }
        else
            System.out.println("Your input is Invalid. Default Burger is selected.");
            return new Hamburger("Maharaja", size, meat, bread, price);
    }














}
