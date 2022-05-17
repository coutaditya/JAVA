public class Lab6 {
    public class Person{
        int age;
        Person(){
            System.out.println("This is a person");
        }

        void introduce(){
            System.out.println("Hi! How are you?");
        }
    }

    public class Male extends Person{
        Male(){
            System.out.println("This is a male");
        }
        
        Male(int age){
            super.age = age;
            System.out.println("This is a male");
        }

        void introduce(){
            System.out.println("Hi! I am "+super.age+ ". How old are you?");
        }
    }

    public class Female extends Person{
        Female(){
            System.out.println("This is a female");
        }

        Female(int age){
            super.age = age;
            System.out.println("This is a female");
        }

        void introduce(){
            System.out.println("Hi! I am "+super.age+ ". How old are you?");
        }
    }

    public class Student extends Male{
        Student(int age){
            super.age=age;
            System.out.println("This is a student");
        }

        void introduce(){
            System.out.println("Hi! I am "+super.age+ ". How old are you?");
        }
    }
    public static void main(String[] args) {
        Lab6 l = new Lab6();

        System.out.println("Person:");
        Person p = l.new Person();
        p.introduce();

        System.out.println("Male:");
        Male m = l.new Male(20);
        m.introduce();

        System.out.println("Female:");
        Female f = l.new Female(28);
        f.introduce();

        System.out.println("Student:");
        Student s = l.new Student(18);
        s.introduce();
    }
}