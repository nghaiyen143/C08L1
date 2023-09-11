package OOP;

public class Cricle {
    private double radius = 0.1;
    private String color = "red";
    public Cricle(){};
    public Cricle(double r){
        this.radius = r;
    };

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
}
