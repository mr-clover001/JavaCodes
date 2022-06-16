import java.util.Scanner;

public class ArrayDemo {

//    public static int ArrReturn(int n){
//        Scanner sc = new Scanner(System.in);
//       int [] Ar = new int[n] ;
//        for (int i=0;i<n;i++)
//        {
//            Ar[i]=sc.nextInt();
//        }
//
////        return Ar;
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Size Array: ");
        n = sc.nextInt();
//        int Arr[] = ArrReturn(n);

        for(int i=0; i<n;i++){
            System.out.println(i+" ");
        }



//      int [] arr = {2, 3, 5, 6, 2};
////      int [][] multiDemArr = {
////              {1,3},
////              {2,4},
////              {5,6}
////      };

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(" size of first array " + multiDemArr[0].length);

    }
}
