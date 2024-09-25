import java.util.*;
class Calculation
{
    public static void main(String arg[])
    {
        int a,b,c,d,e,f,g;
        System.out.println("Enter a,b values:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;
        System.out.println("Addition="+c);
        System.out.println("Subtraction="+d);
        System.out.println("Multiplication="+e);
        System.out.println("Division="+f);
        System.out.println("Modulus="+g);
    }
}
