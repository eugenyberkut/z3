package logic;

/**
 * Created by Yevhen on 04.02.2016.
 */
public class Vehicle {
    private int maxSpeed;
    private String mark;

    public Vehicle(int maxSpeed, String mark) {
        this.maxSpeed = maxSpeed;
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", mark='" + mark + '\'' +
                '}';
    }
}
