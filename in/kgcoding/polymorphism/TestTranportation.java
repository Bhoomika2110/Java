package in.kgcoding.polymorphism;

public class TestTranportation {
    
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
         castTest(v);
        castTest(c);


        Vehicle vCar = new Car();
          vCar.start();
    }
        private static void castTest(Vehicle veh) {
            
            if (veh instanceof Car) {
            
                Car cvehicle = (Car) veh;
                cvehicle.start(); 
                System.out.println("Number of doors: " + cvehicle.noOfDoor());  
            } else {
                System.out.println("This is not a car, it's a generic vehicle.");
                veh.start();
            }
        }
    
    }
