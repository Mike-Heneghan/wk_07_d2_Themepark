package Park.Behaviours;

import Park.Visitors.Visitor;

public interface IRestrictable {
    public boolean isAllowedTo(Visitor visitor);
}

//    IRestrictable needs: Boolean isAllowedTo(Visitor)