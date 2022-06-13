import java.util.Scanner;

public class methods {

    public static Integer Calculator(Integer a, Integer b){
        Integer Result;
         Result = a + b;
        return Result;
    }

    public static void main(String[] args) {
        methods meth =  new methods();

        System.out.println("Taking Input from user: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num1:");
         int a = sc.nextInt();
        System.out.println("enter first num2:");
        int b = sc.nextInt();

        Integer Sum = methods.Calculator(a , b);
        System.out.println(Sum);
    }

}
