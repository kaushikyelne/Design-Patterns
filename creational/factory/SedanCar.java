package designpatterns.creational.factory;

public class SedanCar extends Car{

    SedanCar(){
        super(CarType.SEDAN);
        Construct();
    }
    @Override
    protected void Construct() {
        System.out.println("Sedan car Contructed");
    }
}
