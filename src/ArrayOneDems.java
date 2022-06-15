import java.util.Scanner;

public class ArrayOneDems {

    public static void main(String[] args) {
        System.out.println("Taking Input from user: ");
        Scanner sc = new Scanner(System.in);
        int [] Arr = new int[5];
//        Arr[0] = sc.nextInt();
//        Arr[1] = sc.nextInt();
//        Arr[2] = sc.nextInt();
        for (int i = 0 ; i<5 ; i++){
           Arr[i] = sc.nextInt();
        }
        System.out.println(Arr[4]);
    }
}
