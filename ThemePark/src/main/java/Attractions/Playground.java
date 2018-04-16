package Attractions;

import Behaviours.IRestrictable;
import Visitors.Visitor;

public class Playground extends Attraction implements IRestrictable {

    public Playground(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed = false;
        if (visitor.getAge() <= 15){
            return true;
        }
        return allowed;
    }

}
