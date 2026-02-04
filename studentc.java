//Constructor overloading
public class studentc {
    int id;
    String name;
    //constructor (default)
    studentc()
    {
        id=100;
        name="abc";
    }
    studentc(int i,String n) // Parameterized constructor
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        studentc s1=new studentc(10,"Ayushi");
        studentc s2=new studentc();
        s1.display();
        s2.display();
    }
}
