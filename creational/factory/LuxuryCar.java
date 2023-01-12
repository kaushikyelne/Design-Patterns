package designpatterns.creational.factory;

public class LuxuryCar extends Car{

    LuxuryCar(){
        super(CarType.LUXURY);
        Construct();
    }

    @Override
    protected void Construct() {
        System.out.println("Luxury Car Constructed");
    }
}
