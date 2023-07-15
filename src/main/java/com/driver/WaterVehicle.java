package com.driver;

public interface WaterVehicle {
    public String getName();
    public int getVehicleCapacity();
}

class Boat implements WaterVehicle
{
    String name;
    int capacity;
    public Boat(String name,int capacity)
    {
        this.name = name;
        this.capacity = capacity;
    }
    public String getName()
    {
        return name;
    }
    public int getVehicleCapacity()
    {
        return capacity;
    }
}
