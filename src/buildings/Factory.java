package buildings;

import city.City;
import utility.Pair;

public class Factory extends Building{
    public Factory(City city, Pair<Integer> coordinates, int moneyPerTime, int resourcesPerTime, int foodPerTime, int happinessPerTime) {
        super(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
    }
}
