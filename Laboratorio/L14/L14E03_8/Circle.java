package Laboratorio.L14.L14E03_8;
public class Circle {

    private Vector center;
    private double radius;

    // costruttore di base
    public Circle(Vector center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
        this(new Vector(0.0, 0.0), 0.0);
    }

    public Circle(double x, double y, double raggio) {
        this(new Vector(x, y), raggio);
    }

    public Vector getCenter() { return this.center; }
    public double getRadius() { return this.radius; }


    /** Perimetro: 2 * pi * radius. */
    public double perimetro() {
        return 2.0 * Math.PI * this.radius;
    }

    /** Area: radius^2 * PI. */
    public double area() {
        return Math.PI * this.radius * this.radius;
    }


    /** concentrici = stesso centro */
    public boolean isConcentric(Circle other) { 
        return this.center.equals(other.getCenter());
    }

    /** contains: se la distanza tra i due centri è minore del raggio corrente */
    public boolean contains(Circle other){
        double distance = this.center.distanceTo(other.center);
        return distance + other.radius <= this.radius;
    }

    public Circle copy(){
        return new Circle(this.center.copy(), this.radius);
    }

}


