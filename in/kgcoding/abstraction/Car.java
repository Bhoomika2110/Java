package in.kgcoding.abstraction;

public class Car extends Vehicle{
    private int noOfDoor;

    public Car(){
        super(4);
    }

    @Override
    public void makestartSound() {
        System.out.println("vroomm.....");
    }
}
