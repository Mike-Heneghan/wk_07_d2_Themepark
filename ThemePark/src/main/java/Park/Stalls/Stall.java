package Park.Stalls;

import Park.Behaviours.IChargeable;
import Park.Behaviours.IEnjoyable;
import Park.Visitors.Visitor;

public abstract class Stall implements IChargeable, IEnjoyable {

    private String name;
    private String onwerName;
    private int parkingSpot;
    private double price;
    private int funRating;

    public Stall(String name, String ownerName, int parkingSpot, double price, int funRating){
        this.name = name;
        this.onwerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.price = price;
        this.funRating = funRating;
    }

    public String getName(){
        return name;
    }

    public double priceFor(Visitor visitor) {
        return price;
    }

    public String getOnwerName(){
        return onwerName;
    }

    public int getParkingSpot(){
        return parkingSpot;
    }

    public void customerPurchasesGoods(Visitor visitor){
        visitor.pay(price);
    }

    @Override
    public int getFunRating() {
        return funRating;
    }
}
