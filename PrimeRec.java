import java.util.*;
class PrimeRec{
    static int i=2;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        
        if(isPrime(n,2)) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");
    }
    public static boolean isPrime(int n,int i){
        if(n<=1) return false;
        if(n==i) return true;;
        if(n%i==0) return false;
        return isPrime(n,i+1);
    }
}