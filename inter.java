interface A{
    void ShowA();
}
interface B{
    void ShowB();
}
class C implements A,B{
    public void ShowA()
    {
        System.out.println("Display from interface A");
    }
    public void ShowB()
    {
        System.out.println("Display from interface B");
    }
}

public class inter {
    public static void main(String[] args) {
        C c=new C();
        c.ShowA();
        c.ShowB();
    }
}
