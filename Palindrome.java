import java.util.*;
class Palindrome
{
    public static void main(String arg[])
    {
        int a,s=0,i,x,b;
        System.out.println("Enter a value:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=a;
        {
            x=a%10;
            s=s+x;
            a=a/10;
            if(b==s)
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");
        }
    }
}