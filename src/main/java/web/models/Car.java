package web.models;

public class Car {
    private String model;
    private int series;
    private int hp;

    public Car() {

    }

    public Car(String model, int series, int hp) {
        this.model = model;
        this.series = series;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", hp=" + hp +
                '}';
    }
}
