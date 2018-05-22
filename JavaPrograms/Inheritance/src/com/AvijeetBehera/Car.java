package com.AvijeetBehera;

public class Car extends Vehicle
{
    private int door;
    private int gear;
    private int wheel;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheel, int door, int gear, boolean isManual) {
        super(name, size);
        this.wheel = wheel;
        this.isManual = isManual;
        this.door = door;
        this.gear = gear;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed To " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }
}
