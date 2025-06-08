package in.kgcoding.Challenge83;


public class Square extends shape {
    private final double sideInCms;

    public Square(double sideInCms){
        this.sideInCms= sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms,2);
        
    }
    
    
}
