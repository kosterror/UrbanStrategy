import buildings.*;
import city.City;
import enumeration.BuildingType;
import utility.Pair;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BuildingFactory {

    private final Properties properties;

    public BuildingFactory() {
        try {
            FileInputStream fileInputStream = new FileInputStream("buildingStats.properties");
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Building create(BuildingType buildingType, City city, Pair<Integer> coordinates) {
        String type = buildingType.toString().toLowerCase();

        int moneyPerTime = Integer.parseInt(properties.getProperty(type + ".moneyPerTime"));
        int resourcesPerTime = Integer.parseInt(properties.getProperty(type + ".resourcesPerTime"));
        int foodPerTime = Integer.parseInt(properties.getProperty(type + ".foodPerTime"));
        int happinessPerTime = Integer.parseInt(properties.getProperty(type + ".happinessPerTime"));

        switch (buildingType) {
            case FACTORY:
                return new Factory(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
            case HOSPITAL:
                return new Hospital(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
            case STADIUM:
                return new Stadium(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
            case PARK:
                return new Park(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
            case MALL:
                return new Mall(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
            case FARM:
                return new Farm(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
            case HOUSE:
                return new House(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
            case MINE:
                return new Mine(city, coordinates, moneyPerTime, resourcesPerTime, foodPerTime, happinessPerTime);
        }

        throw new RuntimeException("Unknown building type");
    }
}
