import buildings.Building;
import city.City;
import enumeration.BuildingType;
import utility.Pair;

import java.util.List;

public class GameController {

    private final BuildingFactory buildingFactory;
    private final City city;
    private final Observer observer;
    private List<Building> buildingList;

    public GameController() {
        buildingFactory = new BuildingFactory();
        city = new City();
        observer = new Observer();
    }

    public Building createBuilding(BuildingType type, Pair<Integer> coordinates) {
        Building newBuilding =  buildingFactory.create(type, city, coordinates);
        buildingList.add(newBuilding);
        observer.registerObservable(newBuilding);

        return newBuilding;
    }

    public void destroyBuilding(Building building){
        buildingList.remove(building);
        observer.unregisterObservable(building);
    }

}
