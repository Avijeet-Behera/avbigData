package com.AvijeetBehera;

public class Main {

    public static void main(String[] args)
    {
        Dimensions dimWard = new Dimensions(36, 24, 24);
        Dimensions dimRoom = new Dimensions(120, 120, 120);
        Wardrobe wardrobe = new Wardrobe(dimWard, "RubberWood", 5 );
        Lights light = new Lights("Anchor", "Plastic");
        Door door = new Door("DoubleDoor", "Wood");
        Room room = new Room(wardrobe, light, door, dimRoom);


        room.keepClothes(3);
        room.lightManufacturer();
    }


}
