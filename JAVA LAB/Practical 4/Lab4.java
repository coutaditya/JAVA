import java.util.Scanner;

public class Lab4 {
    public class Complex{
        double r, im;

        Complex(){
            this(0,0);
        }

        Complex(int r, int im){
            this.r = (double)r;
            this.im = (double)im;
        }

        Complex(double r, double im){
            this.r = r;
            this.im = im;
        }

        Complex(String s){
            int l = s.length();
            int i;
            Boolean neg = false;
        
            if (s.indexOf('+') != -1) {
                i = s.indexOf('+');
            }
            
            else {
                neg = true;
                i = s.indexOf('-');
            }

            String real = s.substring(0, i);
            String imaginary = s.substring(i + 1, l - 1);
        
            this.r = Double.parseDouble(real);
            this.im = Double.parseDouble(imaginary);
            if(neg){
                this.im = -1.0*(this.im);
            }
        }

        void printNumber(){
            if(this.im>=0){
                System.out.println(this.r+"+"+this.im+"i");
            }
            else{
                System.out.println(this.r+""+this.im+"i");
            }
        }

        void sum(Complex c2){
            Complex c = new Complex();
            c.r = this.r + c2.r;
            c.im = this.im + c2.im;

            System.out.print("Sum = "); 
            c.printNumber();
        }

        void subtract(Complex c2){
            Complex c = new Complex();
            c.r = this.r - c2.r;
            c.im = this.im - c2.im;

            System.out.print("Difference = "); 
            c.printNumber(); 
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer real part: ");
        int r1 = sc.nextInt();
        System.out.print("Enter integer imaginary part: ");
        int im1 = sc.nextInt();

        Lab4 l = new Lab4();
        Complex c1 = l.new Complex(r1, im1);
        System.out.print("c1=");
        c1.printNumber();

        System.out.print("Enter double real part: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter double imaginary part: ");
        double im2 = sc.nextDouble();

        Complex c2 = l.new Complex(r2, im2);
        System.out.print("c2=");
        c2.printNumber();

        System.out.print("Enter the complex number as a string: ");
        String s = sc.next();

        Complex c3 = l.new Complex(s);
        System.out.print("c3=");
        c3.printNumber();

        System.out.print("c1+c2=");
        c1.sum(c2);

        System.out.print("c1-c2=");
        c1.subtract(c2);

        sc.close();
    }
}

