package designpatterns.creational.factory;


public abstract class Car {

    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }

    private CarType model = null;

    private void arrangeParts() {
        // Do some work
    }
    // Do sub-class level processing
    protected abstract void Construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
