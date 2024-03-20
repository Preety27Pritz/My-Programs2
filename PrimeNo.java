import java.util.*;
class PrimeNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}