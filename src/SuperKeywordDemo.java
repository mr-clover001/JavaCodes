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

public class SuperKeywordDemo {

    public static void main(String args[]){
        Fox d = new Fox();
        d.printColor();
    }
}
