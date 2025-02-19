package com.myapp.transportlogistics.repository;

public class Truck {
    private int id;
    private String numberPlate;
    private int liftingCapacity;
    private int cargoVolume;

    public Truck(int id, String numberPlate, int cargoVolume, int liftingCapacity) {
        this.id = id;
        numberPlate = numberPlate;
        cargoVolume = cargoVolume;
        liftingCapacity = liftingCapacity;
    }


    public int getId() {
        return id;
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }
}
