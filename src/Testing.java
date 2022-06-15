import package_one.ClassTwo;
import package_name.ClassOne;

public class Testing {

    public static void main(String[] args) {
        ClassOne a = new ClassOne();
        ClassTwo b = new ClassTwo();
        a.methodClassOne();
        b.methodClassTwo();

        int i = 10;

        if(i <15)
        {
            System.out.println(i+" is smaller than 15 ");
        }
        else {
            System.out.println(i+"is larger than 15 ");
        }
    }
}
