package com.AvijeetBehera;
import java.util.Scanner;

public class HealthyBurger extends Hamburger
{
    public HealthyBurger(String name, String sizeType, String meatType, String breadType, double price)
    {
        super(name, sizeType, meatType, breadType, price);
    }

    public double chooseAddons()
    {
        double price = super.chooseAddons();
        int choice,count=0;
        Scanner keyboard = new Scanner(System.in);
        while(count < 2)
        {
            System.out.println("Now you can choose up to 2 additional addons on your healthy burger. Please Proceed.");
            System.out.println("1. Almonds @ Rs 25.00.");
            System.out.println("2. Pista @ Rs 15.00.");
            System.out.println("3. Tomato @ Rs 18.00.");
            System.out.println("4. Corn @ Rs 22.00.");
            System.out.println("5. Oats @ Rs 35.00.");
            System.out.println("6. Capsicum @ Rs 10.00.");
            System.out.println("7. Onions @ Rs 30.00.");
            System.out.println("8. Walnuts @ Rs 5.00.");
            System.out.println("9. No AddOns");
            choice = keyboard.nextInt();

            switch(choice)
            {
                case 1:
                    price += 25.00;
                    System.out.println("Almonds has been added as your add-on. Your total price is now Rs " + price + ".");
                    count++;
                    break;
                case 2:
                    price += 15.00;
                    System.out.println("Pista has been added as your add-on. Your total price is now Rs " + price + ".");
                    count++;
                    break;
                case 3:
                    price += 18.00;
                    System.out.println("Tomato has been added as your add-on. Your total price is now Rs " + price + ".");
                    count++;
                    break;
                case 4:
                    price += 22.00;
                    System.out.println("Corn has been added as your add-on. Your total price is now Rs " + price + ".");
                    count++;
                    break;
                case 5:
                    price += 35.00;
                    System.out.println("Oats has been added as your add-on. Your total price is now Rs " + price + ".");
                    count++;
                    break;
                case 6:
                    price += 10.00;
                    System.out.println("Capsicum has been added as your add-on. Your total price is now Rs " + price + ".");
                    count++;
                    break;
                case 7:
                    price += 30.00;
                    System.out.println("Onion has been added as your add-on. Your total price is now Rs " + price + ".");
                    count++;
                    break;
                case 8:
                    price += 5.00;
                    System.out.println("Walnuts has been added as your add-on. Your total price is now Rs " + price + ".");
                    count++;
                    break;
                case 9:
                    count = 3;
                    break;
                default:
                    System.out.println("Please select a valid input");
                    break;
            }
        }
        return price;
    }
}