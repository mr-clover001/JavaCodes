import java.util.Scanner;

public class Main {

    public static int maxNumber(int[] Numbers) {
        int num ;

        num = Numbers[0];
        for (int x: Numbers) {
            if(x > num){
                num = x;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        int[] Marks = {78, 34, 24, 89, 50, 122};
        int maxNum = maxNumber(Marks);
        System.out.println("maximum number within array is " + maxNum);
    }

}