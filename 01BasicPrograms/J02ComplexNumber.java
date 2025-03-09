public class J02ComplexNumber {
    int real, image;

    J02ComplexNumber(int r, int i) {
        this.real = r;
        this.image = i;
    }

    public void printComplex() {
        System.out.println(this.real + " + " + this.image + "i");
    }

    public static J02ComplexNumber add(J02ComplexNumber first, J02ComplexNumber second) {
        J02ComplexNumber result = new J02ComplexNumber(0, 0);
        result.real = first.real + second.real;
        result.image = first.image + second.image;
        return result;
    }

    public static void main(String args[]) {
        J02ComplexNumber n1 = new J02ComplexNumber(5, 2);
        J02ComplexNumber n2 = new J02ComplexNumber(2, 3);
        n1.printComplex();
        n2.printComplex();
        System.out.println("----------------------------");
        J02ComplexNumber result = add(n1, n2);
        result.printComplex();
    }
}
