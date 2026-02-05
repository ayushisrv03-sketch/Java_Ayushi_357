class Animal{
    String name;
    int age;
    void display()
    {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
class Dog extends Animal{
    String breed;
    void displayDog()
    {
        System.out.println("Breed of dog: "+breed);
    }
}
class Cat extends Animal{
    String breedc;
    void displayCat()
    {
        System.out.println("Breed of cat: "+breedc);
    }
}
public class heirarchical_in {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c=new Cat();
        d.name="Tannie";
        d.age=8;
        d.breed="Pomeranian";
        c.name="Holly";
        c.age=10;
        c.breedc="Orange cat";
        d.display();
        d.displayDog();
        c.display();
        c.displayCat();
    }
}
