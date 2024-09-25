import java.util.*;
public class Perimeter {
    public static void main(String arg[]) {
        int  r;
        double pi = 3.14,p;
        System.out.println("Enter r value");
        Scanner s =new Scanner(System.in);
        r = s.nextInt();
        p = 2 * pi * r;
        System.out.println("Perimeter=" + p);
    }
}

