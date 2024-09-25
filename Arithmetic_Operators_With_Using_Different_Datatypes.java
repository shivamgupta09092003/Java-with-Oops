import java.util.*;
class Arithmetic_Operators_With_Using_Different_Datatypes
{
    public static void main(String args[])
    {
        int a,b;
        float c,d;
        String g,h;
        System.out.println("Enter the values of a,b,c,d,g,h: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextFloat();
        d=sc.nextFloat();
        g=sc.next();
        h=sc.next();
        System.out.println("Sum = "+(a+b));
        System.out.println("Sub = "+(c-d));
        System.out.println("Add = "+(g+h));
        System.out.println("Mul = "+(c*d));
        System.out.println("Mod = "+(c%d));
        System.out.println("Div = "+(c/d));
    }
}