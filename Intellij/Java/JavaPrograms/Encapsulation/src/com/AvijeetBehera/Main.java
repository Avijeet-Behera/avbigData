package com.AvijeetBehera;

public class Main {

    public static void main(String[] args)
    {
        Printer printer = new Printer(true,200);

        System.out.println("Initial page count is " + printer.getNoOfPagesPrinted());

        int pagesPrinted = printer.Printpage(20);

        System.out.println("Total number of pages printed are " + pagesPrinted+ ". Toner level is at " + printer.getTonerLvl()+"%.");


        pagesPrinted = printer.Printpage(33);

        System.out.println("Total number of pages printed are " + pagesPrinted+ ". Toner level is at " + printer.getTonerLvl()+"%.");
    }

}
