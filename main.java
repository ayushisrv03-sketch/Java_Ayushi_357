class Person{ //Super class
    String name;
    int age;
    void display()
    {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
class Student extends Person{ //Sub class
    int rollno;
    void displaystudent()
    {
        System.out.println("Rollno: "+rollno);
    }
}


public class main{
    public static void main(String[] args) {
        Student s=new Student();
        s.name="ayushi";
        s.age=19;
        s.rollno=357;
        s.display();
        s.displaystudent();
    }
}