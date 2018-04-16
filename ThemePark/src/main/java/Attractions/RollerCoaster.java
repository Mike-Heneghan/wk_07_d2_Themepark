package Attractions;

import Behaviours.IChargeable;
import Behaviours.IRestrictable;
import Visitors.Visitor;

public class RollerCoaster extends Attraction implements IRestrictable, IChargeable{

    private double price;

    public RollerCoaster(String name, double price){
        super(name);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed = false;
        if (visitor.getAge() > 12 && visitor.getHeight() > 1.45){
            allowed = true;
        }
        return allowed;
    }

    public double priceFor(Visitor visitor){
        double priceToPay = price;
        if (visitor.getAge() < 12){
            priceToPay = (price / 2);
        }
        visitor.pay(priceToPay);
        return priceToPay;
    }


}
