import java.util.*;
class Constructor {
    Constructor(){
        int r;
        double area;
        System.out.println("Enter the value of r: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=3.14*r*r;
        System.out.println("Area of Circle is "+area);

    }
    Constructor(int l,int b){
        int area;
        area=l*b;
        System.out.println("Area of the rectangle is "+area);
    }
    public static void main(String arg[]){
        Constructor a = new Constructor();
        Constructor b = new Constructor(20,25);
    }
}