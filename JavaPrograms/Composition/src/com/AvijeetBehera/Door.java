package com.AvijeetBehera;

public class Door
{
    private String doorType;
    private String material;

    public Door(String doorType, String material) {
        this.doorType = doorType;
        this.material = material;
    }

    public void open()
    {
        System.out.println("Door opened.");
    }

    public String getDoorType() {
        return doorType;
    }

    public String getMaterial() {
        return material;
    }
}
