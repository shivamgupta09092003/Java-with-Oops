import java.util.*;
public class Addition
{
    public static void main(String arg[])
    {
        int a,b,c,d,e,f;
        System.out.println("Enter a,b values");
        Scanner s =new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        d=a-b;
        e=a*b;
        f=a/b;
        System.out.println("Subtraction="+d);
        System.out.println("Multiplication="+e);
        System.out.println("Division="+f);
    }
}