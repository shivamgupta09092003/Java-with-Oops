import java.util.*;
class Area_Of_Circle_And_Rectangle_Using_Class_And_Objects {
    int l,b,r;
    public static void main(String arg[]){
        System.out.println("Enter the Length and Breadth values: ");
        Scanner sc=new Scanner(System.in);
        Area_Of_Circle_And_Rectangle_Using_Class_And_Objects a=new Area_Of_Circle_And_Rectangle_Using_Class_And_Objects();
        a.l=sc.nextInt();
        a.b=sc.nextInt();
        System.out.println("Enter the r value: ");
        a.r=sc.nextInt();
        System.out.println("The Area of Rectangle is "+(a.l*a.b));
        System.out.println("The Area of Circle is "+(3.14*a.r*a.r));
    }
}