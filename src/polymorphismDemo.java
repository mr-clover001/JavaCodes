class Man{
    void pay(){
        System.out.println("man paid");
    }
}

class Millionaire extends Man{
    void pay(){
        System.out.println("Millionaire Man paid");
    }
}


public class polymorphismDemo {
    public static void main(String[] args) {
       Man obj = new Millionaire();
       obj.pay();
    }
}
