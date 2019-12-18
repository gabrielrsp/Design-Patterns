package creationalPatterns.abstractFactory;

public class TestFactory {

    private static Car mountCar(String type){
        CarFactory cf = null;
        switch(type){
            case "luxury":
                cf = new LuxuryCarFactory();
                break;
            case "popular":
                cf = new PopularCarFactory();
                break;

        }
        Car car = new Car();
        car.setWheel(cf.mountWheel());
        car.setAudioPlayer(cf.mountAudioPlayer());
        return car;
    }

    public static void main(String[] args){
        Car c1 = mountCar("luxury");
        Car c2 = mountCar("popular");
        System.out.println("END");
    }

}
