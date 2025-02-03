package oops.Abstarction;

public class CircleInterfaceExample implements ShapeInterface {
    String color;
    double radius;

    public CircleInterfaceExample(String color, double radius){
        this.color = color;
        this.radius =radius;

    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return  Math.PI* Math.pow(radius, 2);
    }

    @Override
    public String info() {
        return " I am a " + color() + " Circle and my area is" + area();
    }
}
