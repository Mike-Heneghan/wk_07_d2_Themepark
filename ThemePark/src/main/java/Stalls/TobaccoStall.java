package Stalls;

import Behaviours.IRestrictable;
import Visitors.Visitor;

public class TobaccoStall extends Stall implements IRestrictable {

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name,ownerName,parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed = false;
        if (visitor.getAge() >= 18){
            allowed = true;
        }
        return allowed;
    }
}
