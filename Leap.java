import java.util.*;
class Leap
{
    public static void main(String arg[])
    {
        int a;
        System.out.println("Enter a value:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%4==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}