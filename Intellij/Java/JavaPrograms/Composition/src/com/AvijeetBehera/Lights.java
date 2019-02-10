package com.AvijeetBehera;

public class Lights
{
    private String manufacturer;
    private String material;

    public Lights(String manufacturer, String material) {
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public void switchOn()
    {
        System.out.println("Lights switched on.");
    }

    public void switchOff()
    {
        System.out.println("Lights switched off.");
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }
}
