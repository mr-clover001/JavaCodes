class Animal{
    String color="white";
}
class Fox extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}

class Elephant extends Animal{
    String color="Grey";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}

public class SuperKeywordDemo {

    public static void main(String args[]){
        Fox f = new Fox();
        Elephant e = new Elephant();

        f.printColor();
        e.printColor();
    }
}
