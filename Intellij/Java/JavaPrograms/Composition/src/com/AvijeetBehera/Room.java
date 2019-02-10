package com.AvijeetBehera;

public class Room
{
    private Wardrobe wardrobe;
    private Lights light;
    private Door door;
    private Dimensions dimensions;

    public Room(Wardrobe wardrobe, Lights light, Door door, Dimensions dimensions) {
        this.wardrobe = wardrobe;
        this.light = light;
        this.door = door;
        this.dimensions = dimensions;
    }

    public void keepClothes(int shelfNumber)
    {
        door.open();
        light.switchOn();
        wardrobe.open();
        wardrobe.putClothes(shelfNumber);
    }

    public void lightManufacturer()
    {
        System.out.println("Manufacturer of lights is "+ getLight().getManufacturer());
    }

    private Wardrobe getWardrobe() {
        return wardrobe;
    }

    private Lights getLight() {
        return light;
    }

    private Door getDoor() {
        return door;
    }

    private Dimensions getDimensions() {
        return dimensions;
    }
}
