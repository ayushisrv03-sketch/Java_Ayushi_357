class Animal{
    String name;
    int age;
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Dog extends Animal{
    String nick;
    void displayDog()
    {
        System.out.println("Nickname: "+nick);
    }
}
class Puppy extends Dog{
    String owner;
    void displayPuppy()
    {
        System.out.println("Owner: "+owner);
    }
}
public class multiin {
    public static void main(String[] args) {
        Puppy s=new Puppy();
        s.name="Yeontan";
        s.age=8;
        s.nick="Tantan";
        s.owner="V";
        s.display();
        s.displayDog();
        s.displayPuppy();
    }
}
