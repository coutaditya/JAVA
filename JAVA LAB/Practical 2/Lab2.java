import java.util.Scanner;

public class Lab2{
    public class Compute{
        int n1, n2;

        public Compute(int n1, int n2){    // Constructor
            this.n1 = n1;
            this.n2 = n2;
        }

        int sum(){
            return n1+n2;
        }

        float avg(){
            return ((float)n1+(float)n2)/2;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        Lab2 l = new Lab2();
        Compute c = l.new Compute(n1, n2);

        System.out.println("Sum = "+c.sum());
        System.out.println("Average = "+c.avg());

        sc.close();
    }
}