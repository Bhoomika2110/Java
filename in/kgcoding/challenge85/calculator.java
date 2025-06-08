package in.kgcoding.challenge85;


public class calculator {
    public  int add(int first,int second){
        return first + second;
    }
    public double add(double first, double second) {
        return first + second;
    }

    public int add(int first , int second , int third ){
        return  first + second + third;
    }
    public static void main(String[] args) {
        calculator  calc =new calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(5,6,7));
        System.out.println(calc.add(5.6,6.8));


    }
}


