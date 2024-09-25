import java.util.*;
class Palindrome_or_not_using_while
{
    public static void main(String arg[])
    {
        int i=0,sum=0,n,r,q;
        System.out.println("Enter the Value: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=n;
        while(n>0)
        {
            r=n%10;
            sum=((sum*10))+r;
            n=n/10;
        }
        if (sum==q)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}