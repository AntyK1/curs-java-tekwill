package homework10;

public class Main {
    public static void main (String[] args) {
        Square s = new Square();
        Circle c = new Circle();

        Polygon polygon1 = new Circle();
        Polygon polygon2 = new Square();

        //Display render() results.
        System.out.println(s.render());
        System.out.println(c.render());
        System.out.println(polygon1.render());
        System.out.println(polygon2.render());

    }
}
