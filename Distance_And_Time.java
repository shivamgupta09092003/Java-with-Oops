import java.util.Scanner;
public class Distance_And_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed (km/h): ");
        double speed = sc.nextDouble();
        System.out.println("Enter the time (hours): ");
        double time = sc.nextDouble();
        double distance = speed * time;
        System.out.println("The distance traveled is: " + distance + " km");
        System.out.println("The time taken is: " + time + " hours");
    }
}