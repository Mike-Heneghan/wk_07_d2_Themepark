package Park.Attractions;

import Park.Behaviours.IRestrictable;
import Park.Visitors.Visitor;

public class Playground extends Attraction implements IRestrictable {

    public Playground(String name, int funRating){
        super(name, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed = false;
        if (visitor.getAge() <= 15){
            return true;
        }
        return allowed;
    }

}
