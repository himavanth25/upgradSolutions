import java.util.*;

class Number {
    //Write your code here
    private double real;
    private double imaginaryPart;
    public Number(double real, double imaginary){
        this.real = real;
        this.imaginaryPart = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
}

class Complex extends Number {
    public Complex(double real, double imaginary) {
        super(real, imaginary);
    }

    public void checkComplex(){
        if(super.getReal() >= 0 && super.getImaginaryPart() > 0)
            System.out.println("The given number is complex");
        else if (super.getReal() >= 0 && super.getImaginaryPart() <=0)
            System.out.println("The given number is real");
    }
//Write your code here
}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double real, double imaginary) {
        super(real, imaginary);
    }

//Write your code here
    public void checkPurelyImaginaryNumber(){
        if(super.getReal() >0 && super.getImaginaryPart() >0){
            System.out.println(super.getReal() + "+i"+super.getImaginaryPart());}
        else if (super.getReal()<=0 && super.getImaginaryPart() >0){
            System.out.println("i"+super.getImaginaryPart());}
        else{
            System.out.println(super.getReal() + "+i"+super.getImaginaryPart());}
    if (super.getReal() == 0 && super.getImaginaryPart() > 0)
        System.out.println("The number is purely imaginary");
    else
        System.out.println("The number is not purely imaginary");
    }
    }


public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}

