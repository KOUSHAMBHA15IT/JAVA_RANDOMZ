import java.util.*;
class PrimeFibonacci
{
    public static boolean prime(int n)
    {
        int f=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f==2)
            return true;
        else
            return false;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter upper limit ");
        int u=sc.nextInt();
        System.out.print("Enter lower limit ");
        int l=sc.nextInt();
        System.out.println("All prime fibonacci number between "+l+" and "+u);
        if(u>100 && u<1000 && l>=100 && l<=u)
        {
            int a=0,b=1;
            while(a<=u)
            {
                if(a>=l && prime(a)==true)
                System.out.println(a);
                int c=a+b;
                a=b;
                b=c;
            }
        }
        else
         System.out.println("Invalid Range");
                
        
    }
}
