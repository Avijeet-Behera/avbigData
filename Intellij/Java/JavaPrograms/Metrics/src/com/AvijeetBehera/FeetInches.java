package com.AvijeetBehera;

public class FeetInches
{
    public static void main(String[] args)
    {
        calcFeetAndInchesToCentimeters(1000);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        double TotalInches;

        if ((feet < 0) || ((inches < 0) && (inches >= 13)))
            return -1;
        else
            TotalInches = (feet * 12) + inches;
            double Centimeters = TotalInches* 2.54;
            System.out.println(feet+" Feet And "+ inches + " Inches Comprises Of "+ Centimeters +" Centimeters");
            return Centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches < 0)
            return -1;

        double Feet = (int)inches/12;
        double RemainingInches = (int) inches%12;

        return calcFeetAndInchesToCentimeters(Feet,RemainingInches);
    }
}
