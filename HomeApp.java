public class HomeApp {
    public static void main(String[] args) {
        HomeInterface home = new HomeInterface();

        System.out.println("Turning on all home services:");
        home.turnOnAll();

        System.out.println("\nTurning off all home services:");
        home.turnOffAll();
    }
}
