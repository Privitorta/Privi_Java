package Laboratorio.L14.L14E03_8;
public class Figure {

    private Circle c1;
    private Circle c2;
    private Segment s1;
    private Segment s2;
    private Segment s3;

    // costruttore con tutti i parametri
    public Figure(Circle c1, Circle c2, Segment s1, Segment s2, Segment s3) {
        this.c1 = c1;
        this.c2 = c2;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    // getter
    public Circle getC1() { return c1; }
    public Circle getC2() { return c2; }
    public Segment getS1() { return s1; }
    public Segment getS2() { return s2; }
    public Segment getS3() { return s3; }

    public boolean hasConcentricCircles(){
        return this.c1.isConcentric(c2);
    }

    public boolean hasTriangle(){
        return Segment.isTriangle(this.s1, this.s2, this.s3);
    }

    public TriangleType gTriangleType(){
        if (!this.hasTriangle()){
            throw new IllegalArgumentException();
        }
        // altrimenti, check.
        Segment [] segments = {this.s1, this.s2, this.s3};
        double [] lengths = new double[segments.length];
        for (int i = 0; i < segments.length; i++){
            lengths[i] = segments[i].length();
        }
        // ok, ora verifichiamo se uguali.
        if (lengths[0] == lengths[1] && lengths[1] == lengths[2]){
            return TriangleType.EQUILATERO;
        } else if (lengths[0] != lengths[1] && lengths[1] != lengths[2] && lengths[0] != lengths[2]){
            return TriangleType.SCALENO;
        }
        return TriangleType.ISOSCELE;
    }

    public static void main(String []args){

        // concentrici e triangolo.
        Figure f1 = new Figure(
            new Circle(new Vector(0, 0), 10),
            new Circle(new Vector(0, 0), 5),
            new Segment(new Vector(0, 0), new Vector(1, 0)),
            new Segment(new Vector(1, 0), new Vector(1, 1)),
            new Segment(new Vector(1, 1), new Vector(0, 0))); 

        System.out.printf("f1.concentrici? %b, f1.triangolo? %b, type: %s\n",
            f1.hasConcentricCircles(), f1.hasTriangle(), f1.gTriangleType().toString()
        );

        // no concentrici, no triangolo.
        Figure f2 = new Figure(
            new Circle(new Vector(0, 0), 10),
            new Circle(new Vector(10, 20), 5),
            new Segment(new Vector(5, 4), new Vector(1, 0)),
            new Segment(new Vector(1, 0), new Vector(1, 1)),
            new Segment(new Vector(1, 1), new Vector(0, 2))); 

        System.out.printf("f2.concentrici? %b, f2.triangolo? %b\n",
            f2.hasConcentricCircles(), f2.hasTriangle()
        );
    }

}
