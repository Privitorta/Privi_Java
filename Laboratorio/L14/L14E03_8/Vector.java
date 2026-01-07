package Laboratorio.L14.L14E03_8;
public class Vector {
    private double x;
    private double y;

    // Costruttori
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        this(0.0, 0.0);
    }

    // getter
    public double getX() { return x; }
    public double getY() { return y; }

    // setter
    public Vector setX(double x) { this.x = x; return this; }
    public Vector setY(double y) { this.y = y; return this; }

    /** sposta this incrementando di dx e dy */
    public Vector move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        return this;
    }

    /** distanza da un altro vettore */
    public double distanceTo(Vector other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    /** distanza del punto dall'origine */
    public double distanceFromOrigin() {
        return Math.sqrt(x*x + y*y);
    }

    public String toString() {
        return String.format("(x=%f, y=%f)", x, y);
    }

    public boolean equals(Vector other){
        return this.x == other.x && this.y == other.y;
    }

    public Vector copy() {
        return new Vector(this.x, this.y);
    }

}