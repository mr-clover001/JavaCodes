 class Demo{
    int roll;
    String name;
    void Display(){
        System.out.println("welcome to my class"+name + " "+ roll);
    }
    Demo(){
        this.name = "Anoop kumar";
        this.roll = 123;
    }
    Demo(int roll , String name){
     this.roll = roll;
     this.name = name;
     System.out.println("i am first hhahah");
    }
};

public class ClassObjectDemo {

    public static void main(String[] args) {
        Demo obj = new Demo();
        Demo d = new Demo(11910295, " Anoop kumar");
        d.Display();
        obj.Display();
    }
}
