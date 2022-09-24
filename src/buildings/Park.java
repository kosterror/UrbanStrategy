package buildings;

import city.City;
import utility.Pair;

public class Park extends Building{
    public Park(City city, Pair<Integer> coordinates, int moneyPerTime, int resourcesPerTime, int foodPerTime, int happinessPerTime) {
        super(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
    }
}
