package Laboratorio.L14.L14E02;
public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public double getReal() { return real; }
    public double getImaginary() { return imaginary; }

    public void add(Complex other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public void multiply(Complex other) {
        double real = this.real * other.real - this.imaginary * other.imaginary;
        double imag = this.real * other.imaginary + this.imaginary * other.real;
        this.real = real;
        this.imaginary = imag;
    }

    public double modulus() {
        // safer: Math.hypot(this.real, this.imaginary); 
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }

}
