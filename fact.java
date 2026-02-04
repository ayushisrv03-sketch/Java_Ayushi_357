public class fact {
    static int factrec(int n)
    {
        if(n==0 ||n==1)
            {return 1;}
        return n*factrec(n-1);
    }
    static int factiter(int n)
    {
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        int number=5;
        System.out.println("factorial of "+number+" is "+factrec(number));
        System.out.println("factorial of "+number+" is "+factiter(number));
    }
}
