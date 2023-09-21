package task7.adapter;

public class ST500 implements SensorTemperature{

    private int id;

    public ST500(int id) {
        this.id = id;
    }

    @Override
    public int getIdentifier() {
        return id;
    }

    @Override
    public double temperature() {
        return 0;
    }
}