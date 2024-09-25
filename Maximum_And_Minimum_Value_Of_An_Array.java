import java.util.*;
class Maximum_And_Minimum_Value_Of_An_Array {
    public static void main(String arg[]) {
        int a[] = new int[5];
        int max, min, i;
        System.out.println("Enter 6 Length Array: ");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        min = a[0];
        max = a[0];
        for (i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("The Minimum element is" + min + "\n The Maximum element" + max);
    }
}