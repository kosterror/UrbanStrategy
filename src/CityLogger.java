import city.City;

public class CityLogger {

    City city;

    public CityLogger(City city) {
        this.city = city;
        startLogging();
    }

    private void startLogging(){
        Thread run = new Thread(() -> {
            while (true) {
                try {
                    city.printInfo();
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        run.start();
    }
}
