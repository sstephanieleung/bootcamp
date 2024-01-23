package box;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    
    private T t;

    public T getT(){
        return this.t;
    }

    public void setT(T t){
        this.t = t;
    }
    
    public static <T> Box<T> createBox(T t){
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }

    public static double calculate(Box<Shape> box){
        return box.getT().area();
    }

    public static void addShape(List<Shape> ls, Shape shape){
        ls.add(shape);
    }

    public static <U extends Shape> void addShape2(List<U> ls , U shape){
        ls.add(shape);
    }

    public static <U extends Shape> void addShape4(List<? extends Shape> ls , Shape shape){
        List<Shape> ls2 = (List<Shape>) ls;
        ls2.add(shape);
    }

    public static <U extends Shape> void addShape5(List<? super Shape> ls , Shape shape){
        ls.add(new Object());
    }

    public static <U extends Shape> void addShape6(List<? super Shape> ls , U shape){
        ls.add(shape);
    }

    public static void addShape7(List<? super Shape> ls , Shape shape){
        ls.add(new SmallCircle(4.0));
        ls.add(new Circle(4.0));
        ls.add(new Shape()); 
        ls.get(0).area();//ls return Object.class objects, so no Shape methods can be used
    }
    public static void addShape8(List<? extends Shape> ls , Shape shape){
        ls.add(new SmallCircle(4.0)); //Compile time error: ls stores objects created by Shape or its other child classes, it may not be possible to assign SmallCircle to the ls
        ls.add(new Circle(4.0));
        ls.add(new Shape());
        ls.get(0).area(); 
    }

    public static <T extends Shape> void addShape3(List<T> ls, Shape shape){ //T could be child class of Shape, error happen if T is Circle and .add(Shape Obj)
        ls.add(shape);
    }

    public static void main(String[] args) {
        Box<Circle> circleBox = new Box<>();
        circleBox.setT(new Circle(3.0));
        //calculate(circleBox);  //Although Shape is parent of Circle, Box<Shape> and Box<Circle> is two distinct types, no Parent/Child relation in between them
        List<? extends Shape> ls = new ArrayList<Shape>();
        ls = new ArrayList<Circle>();
        ls.get(0); //return Shape type
        ls.add(new Shape());

        List<?> xs = new ArrayList<>();
        xs.get(0); //return Object type
        xs.add();

    }

}
