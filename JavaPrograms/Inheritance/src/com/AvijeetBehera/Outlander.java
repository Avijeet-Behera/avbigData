package com.AvijeetBehera;

public class Outlander extends Car
{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0)
        {
            stop();
        }
        else if((newVelocity > 0) && (newVelocity <= 20))
        {
            changeGear(1);
        }
        else if ((newVelocity > 20) && (newVelocity <= 40))
        {
            changeGear(2);
        }
        else if ((newVelocity > 40) && (newVelocity <= 60))
        {
            changeGear(3);
        }
        else if ((newVelocity > 60) && (newVelocity <= 80))
        {
            changeGear(4);
        }
        else if ((newVelocity > 80) && (newVelocity <= 100))
        {
            changeGear(5);
        }
        else
        {
            changeGear(6);
        }

        if (newVelocity > 0)
        {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
