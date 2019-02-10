package com.AvijeetBehera;

class Car
{
    private String name;
    private int cylinders;
    private String engine;
    private int wheels;

    public Car(String name, int cylinders, String engine) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = engine;
        this.wheels = 4;
    }

    public String startEngine()
    {
        return name + "'s engine has been ignited from base class.";
    }

    public String accelerate()
    {
        return name + "'s acceleration has been increased from the base class.";
    }

    public String brake()
    {
        return name + "'s acceleration has been decreased from the base class.";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}

class Duster extends Car
{
    public Duster(String name, int cylinders, String engine)
    {
        super(name, cylinders, engine);
    }

    public String startEngine()
    {
        return "Duster's engine has been ignited.";
    }

    public String accelerate()
    {
        return "Duster's acceleration has been increased.";
    }

    public String brake()
    {
        return "Duster's acceleration has been decreased.";
    }

}

class Creta extends Car
{
    public Creta(String name, int cylinders, String engine)
    {
        super(name, cylinders, engine);
    }

    public String startEngine()
    {
        return "Creta's engine has been ignited.";
    }

    public String accelerate()
    {
        return "Creta's acceleration has been increased.";
    }

    public String brake()
    {
        return "Creta's acceleration has been decreased.";
    }
}

class I20 extends Car
{
    public I20(String name, int cylinders, String engine)
    {
        super(name, cylinders, engine);
    }

    public String startEngine()
    {
        return "I20's engine has been ignited.";
    }

}

public class Main {

    public static void main(String[] args)
    {
	 Car car = new I20("I20",2,"3.0L");
	 System.out.println(car.startEngine());
	 System.out.println(car.accelerate());
	 System.out.println(car.brake());

	 I20 i20 = new I20("Duster",2,"2.6L");
	 System.out.println(i20.startEngine());
	 System.out.println(i20.accelerate());
	 System.out.println(i20.brake());

    }

}
