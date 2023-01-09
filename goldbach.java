// goldbach number is a no. which is a sum of two odd primes 6=3+3
//10=5+5=3+7     put limit between 9 to 50
import java.util.*;
class GoldBach
{
    public static boolean isprime(int n)
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

        System.out.print("N=");
        int n=sc.nextInt();
        if(n>9 && n<50 && n%2==0)
        {
            
            System.out.println("PRIME PAIRS ARE ");
            for(int i=1;i<=n/2;i++)
            {
                if(isprime(i)==true && isprime(n-i)==true)
                 System.out.println(i+","+(n-i));
            }

        }
        else
            System.out.println("Invalid Input");
    }
}
