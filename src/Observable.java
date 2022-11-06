package src;

import java.util.*;

abstract class Observable {
    List<PlotPanel> observers = new ArrayList<>(3);

    public void addObserver(PlotPanel observer){
        this.observers.add(observer);
    }
    public void removeObserver(PlotPanel observer){
        this.observers.remove(observer);
    }
    public void notifying(){
        for( Observer ob : observers)
            ob.update(this);
    }
}
