package in.kgcoding.abstraction;

public abstract class Vehicle  implements Transport{
     private int noOftrires;

     
       public abstract void makestartSound();
       @Override
       public void getSetGo()
       {
        System.out.println("go into place ....");
       }


        public Vehicle(int noOftrires) {
            this.noOftrires = noOftrires;
        }

        public int getNoOftrires() {
            return noOftrires;
        }
        public void setNoOftrires(int noOftrires) {
            this.noOftrires = noOftrires;
        }
        public static void commute() {
            System.out.println("going.......");
        }

}
