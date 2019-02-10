package com.AvijeetBehera;

public class Printer
{
    private boolean isDuplex;
    private int noOfPagesPrinted=0;
    private int tonerLvl = 100;

    public Printer(boolean isDuplex, int tonerLvl)
    {
        this.isDuplex = isDuplex;
        if(tonerLvl>0 && tonerLvl < 100)
        {
            this.tonerLvl = tonerLvl;
        }
    }

    public int Printpage(int pages)
    {
        int pagesToPrint = pages;
        if(isDuplex)
        {
            pagesToPrint = (pages /=2) + pages%2;
            tonerLvl -=(2*pagesToPrint);
            System.out.println("Printing in duplex mode.");
        }
        this.noOfPagesPrinted += pagesToPrint;
        return noOfPagesPrinted;
    }

    public int addToner(int tonerAmount)
    {
        if (tonerAmount > 0 && tonerAmount < 100)
        {
            if((tonerLvl +tonerAmount) > 100)
            {
                return -1;
            }

            tonerLvl += tonerAmount;
            return tonerLvl;
        }
        else
            return -1;
    }
    public boolean isDuplex() {
        return isDuplex;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public int getTonerLvl() {
        return tonerLvl;
    }
}
