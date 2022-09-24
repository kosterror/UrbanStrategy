package city;

import buildings.Building;

import java.util.ArrayList;
import java.util.List;

public class City {

    private int money;
    private int resources;
    private int food;
    private int happiness;
    private final List<Building> buildingList;

    public City() {
        money = 0;
        resources = 0;
        food = 0;
        happiness = 0;
        buildingList = new ArrayList<>();
    }

    public void increaseStats(int money, int resources, int food, int happiness) {
        float coefficient = this.happiness / 100F;

        this.money = (money > 0) ? this.money + (int) (money * coefficient) : this.money + (int) (money / coefficient);
        this.resources = (resources > 0) ? this.resources + (int) (resources * coefficient) : this.resources + (int) (resources / coefficient);
        this.food = (food > 0) ? this.food + (int) (food * coefficient) : this.food + (int) (food / coefficient);
        this.happiness = Math.min(this.happiness + happiness, 100); //т.к. уровень счастье выше 100 не поднимается

        checkLoss();
    }

    private void checkLoss() {
        if (money < 0 || resources < 0 || food < 0 || happiness < 0) {
            System.exit(0); //мега-гениальный костыль
        }
    }

    public void addBuilding(Building building){
        buildingList.add(building);
    }

    public void removeBuilding(Building building){
        buildingList.remove(building);
    }
}
