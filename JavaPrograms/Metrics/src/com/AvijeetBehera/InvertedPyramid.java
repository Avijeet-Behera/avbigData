package com.AvijeetBehera;

public class InvertedPyramid
{
    public static void main(String[] args)
    {
        int i,j,k;

        for(i=7; i>=1; i--)
        {
            for(k=i;k<=7;k++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=(2*i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
