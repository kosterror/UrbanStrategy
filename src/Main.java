import enumeration.BuildingType;
import utility.Pair;

public class Main {
    public static void main(String[] args) {

        GameController gameController = new GameController();

        gameController.createBuilding(BuildingType.FACTORY, new Pair<Integer>(1, 1));
        gameController.createBuilding(BuildingType.HOUSE, new Pair<Integer>(-1, 2));
        gameController.createBuilding(BuildingType.MINE, new Pair<Integer>(2, 3));
        gameController.createBuilding(BuildingType.STADIUM, new Pair<Integer>(3, 4));
        gameController.createBuilding(BuildingType.FARM, new Pair<Integer>(3, 4));
        gameController.createBuilding(BuildingType.FACTORY, new Pair<Integer>(3, 4));
        gameController.createBuilding(BuildingType.PARK, new Pair<Integer>(3, 4));
        gameController.createBuilding(BuildingType.FARM, new Pair<Integer>(3, 4));
        gameController.createBuilding(BuildingType.FACTORY, new Pair<Integer>(3, 4));


    }
}