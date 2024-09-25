import java.util.*;
class Area_Of_Rectangle_And_Square_Using_Class_And_Objects {
    int l,b,side;
    public static void main(String arg[]){
        System.out.println("Enter the Length and Breadth Values: ");
        Scanner sc=new Scanner(System.in);
        Area_Of_Rectangle_And_Square_Using_Class_And_Objects a=new Area_Of_Rectangle_And_Square_Using_Class_And_Objects();
        a.l=sc.nextInt();
        a.b=sc.nextInt();
        System.out.println("Enter the r value: ");
        a.side=sc.nextInt();
        System.out.println("The Area of Rectangle is "+(a.l*a.b));
        System.out.println("The Area of Square  is "+(a.side*a.side));
    }
}