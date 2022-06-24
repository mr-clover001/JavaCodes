public class MoveZero {

    public static void main(String[] args) {

        int[] input = {1, 0, 6, 0, 4};

        int j = 0;
        for (int i = 0; i < input.length; i++){
            if(input[i]!=0){
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
                j++;

            }
        }
        for (int element : input) {
            System.out.print(element + " ");
        }
    }
}