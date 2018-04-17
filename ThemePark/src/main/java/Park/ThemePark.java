package Park;

import Park.Behaviours.IEnjoyable;

import java.util.ArrayList;

public class ThemePark {
    private String name;
    private ArrayList<IEnjoyable> funThings;

    public ThemePark(String name){
        this.name = name;
        this.funThings = new ArrayList<>();
    }

    public void addFunThing(IEnjoyable fun){
        funThings.add(fun);
    }

    public String getName(){
        return name;
    }

    public ArrayList<IEnjoyable> getFunThings() {
        return funThings;
    }

    public String getRatingsString(){
        String ratings = "";
        for (IEnjoyable enjoy: funThings){
            ratings += (enjoy.getName() + " : " + enjoy.getFunRating() + ", ");
        }
        return ratings;
    }
}
