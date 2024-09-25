import java.util.*;
public class Rectangle{
    public static void main(String arg[]){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:-");
        a=sc.nextInt();
        System.out.println("Enter the Breadth:-");
        b=sc.nextInt();
        c=a*b;
        d=2*(a+b);
        System.out.println("Area is:"+c);
        System.out.println("Perimeter is:"+d);
    }
}