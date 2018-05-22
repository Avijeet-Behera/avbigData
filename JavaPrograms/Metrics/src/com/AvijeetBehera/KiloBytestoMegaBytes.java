package com.AvijeetBehera;

public class KiloBytestoMegaBytes
{
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(-2050);
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        int MegaBytes=0;
        int remainingkiloBytes=0;

        if (kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            MegaBytes = kiloBytes / 1024;
            remainingkiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MegaBytes + " MB and " + remainingkiloBytes + " KB");
        }

    }


}
