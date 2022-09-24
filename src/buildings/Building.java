package buildings;

import observer.IObservable;
import utility.Pair;

abstract public class Building implements IObservable {

    private int tier;
    private Pair<Integer> coordinates;
    private int moneyPerTime;
    private int resourcesPerTime;
    private int foodPerTime;
    private int happyPerTime;

    public void increaseTier(){
        //TODO: реализовать
    }


}
