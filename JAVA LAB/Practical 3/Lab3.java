import java.util.Scanner;

public class Lab3 {
    public class Numbers{
        int n1, n2;

        Numbers(){    // DEFAULT CONSTRUCTOR
            System.out.println("Inside the default constructor");
        }

        Numbers(int n1){
            this();   // chains to default constructor
            this.n1 = n1;
            System.out.println("Inside the parametrized constructor with one parameter");
        }

        Numbers(int n1, int n2){
            this(n1);  // chains to parametrized constructor with one parameter
            this.n2=n2;
            System.out.println("Inside the parametrized constructor with two parameter");
        }

        Numbers(Numbers N){   // COPY CONSTRUCTOR
            System.out.println("Copy Constructor called");
            n1 = N.n1;
            n2 = N.n2;
        }

        void display(){
            System.out.println("n1 = "+this.n1+" n2 = "+this.n2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        Lab3 l = new Lab3();
        Numbers c = l.new Numbers(n1, n2);
        Numbers d = c;

        c.display();
        d.display();

        sc.close();
    }
}
