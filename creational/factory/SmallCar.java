package designpatterns.creational.factory;

public class SmallCar extends Car{
    public SmallCar() {
        super(CarType.SMALL);
        Construct();
    }

    @Override
    public void Construct() {
        System.out.println("Small car constructed");
    }
}
