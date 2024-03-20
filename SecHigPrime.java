import java.util.*;
class SecHigPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count=0;
        for(int i=b;i>=a;i--)
        {
            if(isPrime(i))
            {
                //System.out.println(i);
                count++;
                if(count==2) System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        boolean flag=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0){ 
                flag=false;
                break;
            }
        }
        if(flag) return true;
        else return false;
    }
}
