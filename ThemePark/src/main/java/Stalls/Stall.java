package Stalls;

public abstract class Stall {

    private String name;
    private String onwerName;
    private int parkingSpot;

    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.onwerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName(){
        return name;
    }

    public String getOnwerName(){
        return onwerName;
    }

    public int getParkingSpot(){
        return parkingSpot;
    }
}
