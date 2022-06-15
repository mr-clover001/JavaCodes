public class ForEachDemo {

    public static int CalcArraySize(int[] Numbers){

        int Total = 0;
        for(int num : Numbers){
            Total = Total + num;
        }

        return Total;

    }

    public static void main(String[] args) {
        ForEachDemo obj  = new ForEachDemo();
        int [] marks = {96, 89, 57, 87,99};
        int Sum = obj.CalcArraySize(marks);
        System.out.println("total marks obtain  is "+ Sum);

    }


}
