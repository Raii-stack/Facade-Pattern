public class HomeInterface {
    private final Light light;
    private final TV tv;
    private final AirConditioning airConditioning;

    public HomeInterface() {
        light = new Light();
        tv = new TV();
        airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        airConditioning.turnOff();
        tv.turnOff();
        light.turnOff();
    }
}
