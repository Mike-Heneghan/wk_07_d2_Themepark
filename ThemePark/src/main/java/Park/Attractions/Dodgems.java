package Park.Attractions;

import Park.Behaviours.IChargeable;
import Park.Visitors.Visitor;

public class Dodgems extends Attraction implements IChargeable {

    private double price;

    public Dodgems (String name, int funRating, double price){
        super(name, funRating);
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
