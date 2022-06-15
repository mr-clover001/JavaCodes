

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("sum of these number is: ");
        int num1=32;
        int num2=87;
        int num3=39;
        int sum= num1+num2+num3;
        System.out.println(sum);

        for (int i = 0 ; i<5 ; i++)
        {
            System.out.println(num1+i);

        }

        while(num2<90){

            System.out.println("value of num2"+ num2++);
        }

    }
}