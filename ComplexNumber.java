class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }
    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 2);
        ComplexNumber c2 = new ComplexNumber(4, -2);
        ComplexNumber sum = c1.add(c2);
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}