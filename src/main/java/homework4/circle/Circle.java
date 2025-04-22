package homework4.circle;

public class Circle {
    Integer radius;

    public Circle (Integer radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double Area = Math.PI * radius * radius;
        System.out.println("Circle area is equal with: " + Area);
    }
}
