package Park.Attractions;

import Park.Behaviours.IEnjoyable;

public abstract class Attraction implements IEnjoyable {
    private String name;
    private int funRating;

    public Attraction(String name, int funRating){
        this.name = name;
        this.funRating = funRating;
    }

    public String getName(){
        return name;
    }

    @Override
    public int getFunRating() {
        return funRating;
    }
}
