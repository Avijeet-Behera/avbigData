package com.AvijeetBehera;

public class Wardrobe
{
    private Dimensions dimensions;
    private String material;
    private boolean isOpen;
    private int shelves;

    public Wardrobe(Dimensions dimensions, String material, int shelves) {
        this.dimensions = dimensions;
        this.material = material;
        this.isOpen = false;
        this.shelves = shelves;
    }

    public boolean open()
    {
     isOpen = true;
        System.out.println("Wardrobe is now open.");
     return isOpen;
    }

    public void putClothes(int shelfNumber)
    {
        System.out.println("Clothes kept at shelf number " + shelfNumber + " successfully.");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public int getShelves() {
        return shelves;
    }
}




