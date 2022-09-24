package city;

public class City {

    private int money;
    private int resources;
    private int food;
    private int happiness;

    public City() {
        money = 0;
        resources = 0;
        food = 0;
        happiness = 0;
    }

    public void increaseStats(int money, int resources, int food, int happiness) {
        float coefficient = happiness / 100F;

        this.money = this.money + (int) (money * coefficient);
        this.resources = this.resources + (int) (resources * coefficient);
        this.food = this.food + (int) (food * coefficient);
        this.happiness += Math.min(happiness, 100); //т.к. уровень счастье выше 100 не поднимается
    }

    private void checkLoss() {
        if (money < 0 || resources < 0 || food < 0 || happiness < 0) {
            System.out.println("Вы проиграли");
        }
    }

}
