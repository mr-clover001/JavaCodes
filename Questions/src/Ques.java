public class Ques {

    int num;//instance variable

    //constructor
    Ques(int r){
       num = r;

    }
    //method to display the values
    void display () {
        while (true) {
            if (num % 2 == 0)
                num /= 2;
            else {
                num -= 1;
                System.out.println(num);
                break;
            }
        }

    }

    //Test class to show the values of objects


    public static void main(String args[]){
        Ques s1 = new Ques(5);

        s1.display();

    }

}