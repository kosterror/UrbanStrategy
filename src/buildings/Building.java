package buildings;

import observer.IObservable;
import city.City;
import utility.Pair;

abstract public class Building implements IObservable {

    private City city;
    private int tier;
    private Pair<Integer> coordinates;
    private int moneyPerTime;
    private int resourcesPerTime;
    private int foodPerTime;
    private int happinessPerTime;

    public void increaseTier(int tier) {
        float coefficient = 0.3F;

        while (this.tier < tier) {
            moneyPerTime += moneyPerTime * coefficient;
            resourcesPerTime += resourcesPerTime * coefficient;
            foodPerTime += foodPerTime * coefficient;
            happinessPerTime += happinessPerTime * coefficient;

            this.tier++;
        }
    }

    @Override
    public void update() {
        city.increaseStats(moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
    }
}
