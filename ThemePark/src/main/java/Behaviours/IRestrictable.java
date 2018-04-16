package Behaviours;

import Visitors.Visitor;

public interface IRestrictable {
    public boolean isAllowedTo(Visitor visitor);
}

//    IRestrictable needs: Boolean isAllowedTo(Visitor)