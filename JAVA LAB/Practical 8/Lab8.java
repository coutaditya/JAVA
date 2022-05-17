public class Lab8 {
    public class child{
        int age;

        void introduce(){
            System.out.println("I am a child");
        }
    }

    public class boy extends child{
        boy(int age){
            super.age = age;
        }

        // Method Overriding: Run time polymorphism
        // Overrides the introduce() method of parent class if object of child is created
        void introduce(){
            System.out.println("I am a boy");
        }
    }

    public class girl extends child{
        girl(int age){
            super.age = age;
        }

        // Method Overriding: Run time polymorphism
        // Overrides the introduce() method of parent class if object of child is created
        void introduce(){
            System.out.println("I am a girl");
        }
    }
    public static void main(String[] args) {
        Lab8 l = new Lab8();

        child c = l.new child();
        c.introduce();

        boy b = l.new boy(6);
        b.introduce();  // overrides the introduce method of class: child

        girl g = l.new girl(8);
        g.introduce();  // overrides the introduce method of class: child
    }
}