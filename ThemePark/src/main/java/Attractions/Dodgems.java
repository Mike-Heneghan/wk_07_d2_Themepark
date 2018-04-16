package Attractions;

import Behaviours.IChargeable;
import Visitors.Visitor;

public class Dodgems extends Attraction implements IChargeable {

    private double price;

    public Dodgems (String name, double price){
        super(name);
        this.price =  price;
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
