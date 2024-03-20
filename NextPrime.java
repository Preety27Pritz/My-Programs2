import java.util.*;
class NextPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int nextPrime = findNextPrime(n);
        System.out.println("Next prime number after " + n + " is: " + nextPrime);
    }

    public static int findNextPrime(int n) {
        if (n <= 1) return 2; // If n is 1 or less, the next prime is 2
        n++; // Start checking from the next number
        while (true) {
            if (isPrime(n)) return n;
            n++; // Move to the next number
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        boolean flag=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag) return true;
        else return false;
    }
}