import java.util.*;
class Binary
{
    public static void main(String args[])
    {
        int s=0,n,x;
        System.out.println("Enter n value: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (n>0)
        {
            x=n%2;
            s=s*10+x;
            n=n/2;
        }
        System.out.println("Binary Number is :"+s);
    }
}