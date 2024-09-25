import java.util.*;
class Factorial_using_for
{
    public static void main(String arg[])
    {
        int i,n,f=1;
        System.out.println("Enter the Value: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial is "+f);
    }
}