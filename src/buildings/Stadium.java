package buildings;

import city.City;
import utility.Pair;

public class Stadium extends Building{
    public Stadium(City city, Pair<Integer> coordinates, int moneyPerTime, int resourcesPerTime, int foodPerTime, int happinessPerTime) {
        super(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
    }
}
