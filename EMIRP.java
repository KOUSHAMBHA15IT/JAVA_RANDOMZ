//recursion(twisted prime)
import java.util.*;
class Emirp
{
    int n,rev,f;
    Emirp(int nn)
    {
       n=nn; 
       rev=0; 
        f=2;
    }
    int isprime(int x)
    {
        if(f==x)
        return 1;
        else if(x==1|| x%f==0)
        return 0;
        else
        {
            f++;
            return isprime(x);
        }
    }
    void isEmirp()
    {
        int cpy=n;
        while(cpy>0)
        {
            int d=cpy%10;
            rev=rev*10 + d;
            cpy=cpy/10;
        }
        int a=isprime(n);
        f=2;
        int b=isprime(rev);
        if(a==1 && b==1)
        System.out.println("EMIRP NUMBER");
        else
        System.out.println("NOT EMIRP NUMBER");
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int nn=sc.nextInt();
        Emirp ob=new Emirp(nn);
        ob.isEmirp();
    }
}
