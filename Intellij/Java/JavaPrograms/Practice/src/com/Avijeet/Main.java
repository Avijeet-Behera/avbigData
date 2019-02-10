package com.Avijeet;

public class Main
{
    public static void main(String[] args)
    {
        isPalindrome(1221);
    }

    public static boolean isPalindrome(int num)
    {
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;

        // reversed integer is stored in variable
        while (num != 0)
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
        {
            System.out.println(originalInteger + " is a palindrome.");
            return true;
        }
        else
            System.out.println(originalInteger + " is not a palindrome.");
            return false;
    }
}
