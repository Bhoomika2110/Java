package in.kgcoding.util;

import in.kgcoding.geomerty.Circle;
import in.kgcoding.geomerty.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);

double cirArea = Math.PI*Math.pow(cir.radius, 2);
double rectArea = rect.breadth * rect.length;
System.out.printf("area of circle is; %f , area of reactangle is ; %f" ,
     cirArea, rectArea);
    

    }

}
