///METHOD OVERLOADING
public class method {
    int add(int a,int b){
        int sum=add(10,20,30);
        return sum;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        method s1=new method();
        System.out.println(s1.add(10,20));
        System.out.println(s1.add(10,20,30));
    }
}