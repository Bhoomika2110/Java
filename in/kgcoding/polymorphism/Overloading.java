package in.kgcoding.polymorphism;

public class Overloading {

    Overloading() {
        System.out.println("Default costructor called");
    }
 
    Overloading(String pop){
        System.out.println("Pop");
    }

    
    public int sum(int a ,int b){
        return a+b;

    }
    public String sum(String a, String b){
        return a+b;
    }

    public int sum(int a ,int b, int c,int d){
        return a + b + c + d;
    }
    public static void main (String[] args){

        Overloading overload = new Overloading();     
        int sum = overload.sum(3,4);
        overload.sum("a,","b");
        System.out.println(overload.sum(5, sum,7,8));

    
}
}