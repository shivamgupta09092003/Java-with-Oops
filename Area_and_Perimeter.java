import java.util.*;
class Area_and_Perimeter
{
    public static void main(String arg[])
    {
        int r;
        double s,pi = 3.14,p;
        System.out.println("Enter r value");
        Scanner sc =new Scanner(System.in);
        r=sc.nextInt();
        s = pi * r * r;
        p = 2 * pi * r;
        System.out.println("Area of Circle="+s);
        System.out.println("Perimeter="+p);

    }
}