package box;

import java.util.LinkedList;
import java.util.List;

import javax.naming.LinkLoopException;
import javax.sound.midi.Soundbank;

public class Shape {

    
    public double area(){
        return 0.0;
    }

    //Static Method: Sum Up all area from the class objects (circles / squares)
    public static <T extends Shape> double area(List<T> shapes){  //anything wrong?
        double sum = 0.0d;
        for(T element: shapes)
            sum+= element.area();
        return sum;
    }

    public static double area2(List<Shape> shapes){
        double sum = 0.0d;
        for(Shape element: shapes)
            sum+= element.area();
        return sum;
    }

    public static double area3(List<? extends Shape> shapes){
        double sum = 0.0d;
        for(Shape element: shapes)
            sum+= element.area();
        return sum;
    }

    public static void area4(List<? super Shape> shapes, Shape shape){
        shapes.add(shape);
    }

    public static void main(String[] args) {
        List<Shape> listShapes = new LinkedList<>();
        List<Circle> listCircle = new LinkedList<>();
        List<Square> listSquare = new LinkedList<>();
        listCircle.add(new Circle(2.0)); //area = 12.566
        listCircle.add(new Circle(3.0)); //area = 28.274
        listSquare.add(new Square(2.0)); //area = 4.0
        listSquare.add(new Square(3.0)); //area = 9.0

        listShapes.addAll(listCircle);
        listShapes.addAll(listSquare);

        System.out.println(Shape.area(listCircle)); //40.840704496667314
        System.out.println(Shape.area(listSquare)); //13.0
        System.out.println(Shape.area(listShapes)); //53.840704496667314

        System.out.println(Shape.area2(listCircle)); //listCircle mismatch method parameter input type List<Shape>
        System.out.println(Shape.area2(listSquare)); //listSquare mismatch method parameter input type List<Shape>
        System.out.println(Shape.area2(listShapes)); //53.840704496667314

        System.out.println(Shape.area3(listCircle)); //40.840704496667314
        System.out.println(Shape.area3(listSquare)); //13.0
        System.out.println(Shape.area3(listShapes)); //53.840704496667314


    }
}
