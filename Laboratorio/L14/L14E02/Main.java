package Laboratorio.L14.L14E02;
public class Main {
    
    public static void main(String [] args){

        Complex c = new Complex(1,1);

        c.add(new Complex(3, 3));
        c.multiply(new Complex(1, 1));

        System.out.printf("Complex: (%f %f), modulus: %f", c.getReal(), c.getImaginary(), c.modulus());
    }
}
