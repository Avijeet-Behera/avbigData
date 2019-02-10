package com.AvijeetBehera;
import java.util.Scanner;

public class Hamburger
{
    private String name;
    private String sizeType;
    private String meatType;
    private String breadType;
    private double price;

    public Hamburger(String name, String sizeType, String meatType, String breadType, double price)
    {
        this.name = name;
        this.sizeType = sizeType;
        this.meatType = meatType;
        this.breadType = breadType;
        this.price = price;
        System.out.println(this.sizeType + " " + this.name + " Hamburger with " + this.breadType + " crust has been ordered successfully. Your total price is Rs " + this.price + ".");
    }

    public double chooseAddons()
    {
        int choice,count=0;
        Scanner keyboard = new Scanner(System.in);
        while(count < 4)
        {
            System.out.println("You can choose up to 4 addons for your burger. Please Proceed.");
            System.out.println("1. Cheese @ Rs 25.00.");
            System.out.println("2. Tomato @ Rs 15.00.");
            System.out.println("3. Chips @ Rs 18.00.");
            System.out.println("4. Lettuce @ Rs 22.00.");
            System.out.println("5. Sausages @ Rs 35.00.");
            System.out.println("6. Capsicum @ Rs 10.00.");
            System.out.println("7. Butter @ Rs 30.00.");
            System.out.println("8. Cherry @ Rs 5.00.");
            System.out.println("9. No AddOns");
            choice = keyboard.nextInt();

            switch(choice)
            {
                case 1:
                    this.price += 25.00;
                    System.out.println("Cheese has been added as your add-on. Your total price is now Rs " + this.price + ".");
                    count++;
                    break;
                case 2:
                    this.price += 15.00;
                    System.out.println("Tomato has been added as your add-on. Your total price is now Rs " + this.price + ".");
                    count++;
                    break;
                case 3:
                    this.price += 18.00;
                    System.out.println("Chips has been added as your add-on. Your total price is now Rs " + this.price + ".");
                    count++;
                    break;
                case 4:
                    this.price += 22.00;
                    System.out.println("Lettuce has been added as your add-on. Your total price is now Rs " + this.price + ".");
                    count++;
                    break;
                case 5:
                    this.price += 35.00;
                    System.out.println("Brocolli has been added as your add-on. Your total price is now Rs " + this.price + ".");
                    count++;
                    break;
                case 6:
                    this.price += 10.00;
                    System.out.println("Capsicum has been added as your add-on. Your total price is now Rs " + this.price + ".");
                    count++;
                    break;
                case 7:
                    this.price += 30.00;
                    System.out.println("Butter has been added as your add-on. Your total price is now Rs " + this.price + ".");
                    count++;
                    break;
                case 8:
                    this.price += 5.00;
                    System.out.println("Cheese has been added as your add-on. Your total price is now Rs " + this.price + ".");
                    count++;
                    break;
                case 9:
                    count = 5;
                    break;
                default:
                    System.out.println("Please select a valid input");
                    break;
            }
        }
        return this.price;
    }

    public String getSizeType() {
        return sizeType;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getBreadType() {
        return breadType;
    }
}
