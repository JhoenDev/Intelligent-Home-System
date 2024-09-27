public class HomeInterface {
    private HomeService homeService1;
    private HomeService homeService2;
    private HomeService homeService3;

    public HomeInterface(HomeService homeService1, HomeService homeService2, HomeService homeService3) {
        this.homeService1 = homeService1;
        this.homeService2 = homeService2;
        this.homeService3 = homeService3;
    }

    public String turnOnAll() {
        return homeService1.turnOn() + homeService2.turnOn() + homeService3.turnOn();
    }

    public String turnOffAll() {
        return homeService1.turnOff() + homeService2.turnOff() + homeService3.turnOff();
    }
    
}