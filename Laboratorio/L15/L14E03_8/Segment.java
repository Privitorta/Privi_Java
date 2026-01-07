package Laboratorio.L14.L14E03_8;
public class Segment {

    private Vector a;
    private Vector b;

    public Segment(Vector a, Vector b){
        // oppure con copy per maggiore robustezza
        this.a = a;
        this.b = b;
    }

    public Segment(){
        this.a = new Vector();
        this.b = new Vector();
    }

    // getter
    public Vector getA() { return a; }
    public Vector getB() { return b; }

    public void setA(Vector a) {
        this.a = a;
    }

    public void setB(Vector b) {
        this.b = b;
    }

    /** uguaglianza: indipendente dall'ordine di a e b, dato
     * che non c'è direzione
     */
    public boolean equals(Segment other){
        return (this.a.equals(other.a) && this.b.equals(other.b)) || (this.a.equals(other.b) && this.b.equals(other.a));
    }

    public Segment copy() {
        return new Segment(this.a.copy(), this.b.copy());
    }


    public static boolean isTriangle(Segment s1, Segment s2, Segment s3) {
        if (s1 == null || s2 == null || s3 == null) return false;

        Vector a1 = s1.getA();
        Vector b1 = s1.getB();
        Vector a2 = s2.getA();
        Vector b2 = s2.getB();
        Vector a3 = s3.getA();
        Vector b3 = s3.getB();

        // controlliamo se esistono dei punti in comune.
        // fino a cui verifichiamo che possiamo attaccare due linee tra loro.
        // --> tra s1 e s2
        boolean s1_s2 = pointsEqual(a1, a2) || pointsEqual(a1, b2) || pointsEqual(b1, a2) || pointsEqual(b1, b2);
        // --> tra s2 e s3
        boolean s2_s3 = pointsEqual(a2, a3) || pointsEqual(a2, b3) || pointsEqual(b2, a3) || pointsEqual(b2, b3);
        // --> tra s3 e s1
        boolean s3_s1 = pointsEqual(a3, a1) || pointsEqual(a3, b1) || pointsEqual(b3, a1) || pointsEqual(b3, b1);

        // se ne manca almeno 1, allora non posso unirli
        if (!(s1_s2 && s2_s3 && s3_s1))
            return false;

        // dobbiamo verificare però che ci siano almeno 3 punti distinti,
        // evitando quindi sovrapposizioni.
        // contatore
        int distinct = 0;
        Vector[] points = {a1, b1, a2, b2, a3, b3};
        // flag a true quando visto
        boolean[] seen = new boolean[6];

        for (int i = 0; i < points.length; i++) {
            if (!seen[i]) {
                distinct++;
                // mettiamo a true tutti i punti diversi da quello
                // corrente che sono uguali.
                for (int j = i + 1; j < points.length; j++) {
                    if (pointsEqual(points[i], points[j])) {
                        seen[j] = true;
                    }
                }
            }
        }

        return distinct >= 3;
    }

    /** utils */
    private static boolean pointsEqual(Vector p, Vector q) {
        return p.getX() == q.getX() && p.getY() == q.getY();
    }

    public double length() {
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
}
