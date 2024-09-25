import java.util.*;
class Method_Overloading {
    void print_number(int a){
        System.out.println("The number is: "+a);
    }
    void print_number(int a,int b){
        System.out.println("Numbers combined is "+(a+b));
    }
    public static void main(String arg[]){
        Method_Overloading sc=new Method_Overloading();
        sc.print_number(30);
        sc.print_number(30,60);
    }
}