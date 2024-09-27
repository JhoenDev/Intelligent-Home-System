public class HomeApp {
    public static void main(String[] args) {
        HomeService homeServiceTV = new TV();
        HomeService homeServiceLight = new Light();
        HomeService homeServiceAC = new AirConditioning();

        HomeInterface facade = new HomeInterface(homeServiceTV, homeServiceLight, homeServiceAC);

        System.out.println(facade.turnOnAll());
        System.out.println(facade.turnOffAll());
    }
    
}