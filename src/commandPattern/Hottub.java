package commandPattern;

public class Hottub {
    String location;
    int temperature;

    public Hottub(String location) {
        this.location = location;
    }

    public void on() {
        temperature = 105;
        System.out.println(location + " hottub is on");
    }

    public void off() {
        temperature = 98;
        System.out.println(location + " hottub is off");
    }

    public int getTemperature() {
        return temperature;
    }

    public void circulate() {
        System.out.println(location + " hottub is circulating");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
