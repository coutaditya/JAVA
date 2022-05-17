import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Lab5 {
    public class Complex{
        double re, im;
        Random rand = new Random();

        Complex(){
            this.re = rand.nextDouble(99);
            this.im = rand.nextDouble(99);
        }

        String printComplex(){
            // System.out.printf("%.2f + i%.2f", this.re, this.im);
            return (this.re + " + i" + this.im);
        }

        String add(Complex c1){
            Complex c = new Complex();
            c.re = this.re+c1.re;
            c.im = this.im+c1.im;

            return "(" + this.printComplex() + ") + (" + c1.printComplex() + ") = " +c.printComplex();
            // System.out.print("(");
            // this.printComplex();
            // System.out.print(") + (");
            // c1.printComplex();
            // System.out.print(") = ");
            // c.printComplex();
        }

        String sub(Complex c1){
            Complex c = new Complex();
            c.re = this.re-c1.re;
            c.im = this.im-c1.im;

            return "(" + this.printComplex() + ") - (" + c1.printComplex() + ") = " +c.printComplex();
            // System.out.print("(");
            // this.printComplex();
            // System.out.print(") - (");
            // c1.printComplex();
            // System.out.print(") = ");
            // c.printComplex();
        }

        String multiply(Complex c1){
            Complex c = new Complex();
            c.re = this.re*c1.re - this.im*c1.im;
            c.im = this.re*c1.im - this.im*c1.re;

            return "(" + this.printComplex() + ") * (" + c1.printComplex() + ") = " +c.printComplex();
            // System.out.print("(");
            // this.printComplex();
            // System.out.print(") * (");
            // c1.printComplex();
            // System.out.print(") = ");
            // c.printComplex();
        }
        
        String divide(Complex c1){
            Complex c = new Complex();
            c.re = (this.re*c1.re - this.im*c1.im)/(c1.re*c1.re+c1.im*c1.im);
            c.im = (this.re*c1.im - this.im*c1.re)/(c1.re*c1.re+c1.im*c1.im);

            return "(" + this.printComplex() + ") / (" + c1.printComplex() + ") = " +c.printComplex();
            // System.out.print("(");
            // this.printComplex();
            // System.out.print(") / (");
            // c1.printComplex();
            // System.out.print(") = ");
            // c.printComplex();
        }
    }

    public static void main(String args[]) throws IOException{
        Lab5 l = new Lab5();

        Complex c1 = l.new Complex();
        Complex c2 = l.new Complex();

        FileWriter myWriter = new FileWriter("complex.txt");

        myWriter.write("c1 = ");
        myWriter.write(c1.printComplex());
        myWriter.write("\n");
        myWriter.write(("c2 = "));
        myWriter.write(c2.printComplex());
        myWriter.write("\n");

        myWriter.write(c1.add(c2));
        myWriter.write("\n");
        myWriter.write(c1.sub(c2));
        myWriter.write("\n");
        myWriter.write(c1.multiply(c2));
        myWriter.write("\n");
        myWriter.write(c1.divide(c2));

        myWriter.close();
    }
}
