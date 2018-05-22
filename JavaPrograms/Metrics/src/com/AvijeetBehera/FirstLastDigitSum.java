package com.AvijeetBehera;

public class FirstLastDigitSum
{
    public static void main(String[] args)
    {
        sumFirstAndLastDigit(100);
    }

    public static int sumFirstAndLastDigit(int number)
    {
        int firstdigit = 0;
        int lastdigit = 0;
        int sum=0;

        if (number < 0) {
            System.out.println("Invalid Value.");
            return -1;
        }
        else
        {
            int x =number;
            while (x > 9)
            {
                x /= 10;

            }
            firstdigit = x;
            lastdigit = number % 10;
            sum = firstdigit + lastdigit;
            System.out.println("Sum of first digit and last digit for the number " + number + " is = " + sum + ".");
            return sum;
        }

    }
}
