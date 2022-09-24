import buildings.Building;
import city.City;
import enumeration.BuildingType;
import utility.Pair;

public class GameController {

    private final BuildingFactory buildingFactory;
    private final City city;
    private final Observer observer;

    public GameController() {
        buildingFactory = new BuildingFactory();
        city = new City();
        observer = new Observer();
    }

    public Building createBuilding(BuildingType type, Pair<Integer> coordinates) {
        Building newBuilding =  buildingFactory.create(type, city, coordinates);

        city.addBuilding(newBuilding);
        observer.registerObservable(newBuilding);

        return newBuilding;
    }

    public void destroyBuilding(Building building){
        city.removeBuilding(building);
        observer.unregisterObservable(building);
    }

}
