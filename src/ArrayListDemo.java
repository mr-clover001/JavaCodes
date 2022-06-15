import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Array ");
        n = Sc.nextInt();
        ArrayList<Integer> Numbers = new ArrayList<>(n);
        System.out.println("Enter the Values:  ");
        for (int i = 1; i <=5; i++)
            Numbers.add(Sc.nextInt());

        System.out.println("your Array: "+Numbers);
    }
}
