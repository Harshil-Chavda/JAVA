import java.util.*;

public class for_loop_java {
    public static void main(String args[]) {
        int i;
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println( "enter 5 numbers:");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            System.out.println("my  array elements are :");
            for (i = 0; i < 5; i++)
                System.out.print(a[i]);
        }
        for (int x : a)
            System.out.println(x);
    }
}