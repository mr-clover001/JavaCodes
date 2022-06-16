class Message{
    Message(){
        this("Anoop");
        System.out.println("welcome to My Home");
    }
    Message(String n){
        System.out.println(n);
    }
};

public class ThiskeywordDemo {

    public static void main(String[] args) {
       Message obj = new Message();

    }
}
