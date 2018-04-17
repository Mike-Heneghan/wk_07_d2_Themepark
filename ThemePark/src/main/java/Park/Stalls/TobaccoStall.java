package Park.Stalls;

import Park.Behaviours.IRestrictable;
import Park.Visitors.Visitor;

public class TobaccoStall extends Stall implements IRestrictable {

    public TobaccoStall(String name, String ownerName, int parkingSpot, double price, int funRating){
        super(name,ownerName,parkingSpot, price, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed = false;
        if (visitor.getAge() >= 18){
            allowed = true;
        }
        return allowed;
    }
}
