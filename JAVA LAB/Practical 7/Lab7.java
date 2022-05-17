public class Lab7 {
    public class child{
        int age;

        void introduce(){
            System.out.println("I am a child");
        }

        // Method Overloading: Compile time polymorphism
        // Overloads the above introduce() method
        void introduce(int age){
            this.age=age;
            System.out.println("I am a child. I am "+age+" years old");
        }

        // Method Overloading
        String introduce(int age, String name){
            this.age=age;
            System.out.println("I am a child. I am "+age+" years old");
            return "My name is "+name;
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
        Lab7 l = new Lab7();

        boy b = l.new boy(6);

        b.introduce();
        b.introduce(6);
        System.out.println(b.introduce(6, "Luke"));

        girl g = l.new girl(8);
        g.introduce();
        System.out.println(g.introduce(8, "Arya"));

    }
}
